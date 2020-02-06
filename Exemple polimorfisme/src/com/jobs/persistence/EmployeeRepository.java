package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	//lista donde se agregan TODOS los empleados
	private static List<AbsStaffMember> members=new ArrayList<>();
	
	//constructor de repository (lista donde añadir employees)
	public EmployeeRepository(){
		
		
	}
	
	//getter de la lista de empleados
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	//metodo para añadir miembros a la lista
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
}




