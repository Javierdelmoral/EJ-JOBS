package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	//constructor
	public JobsController(){
		
	}
	
	//creator employees
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee); 
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager); 		
	}
	
	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer); 				
	}

	//pay method
	public void payAllEmployeers() {
		
		for (int i = 0; i < repository.getAllMembers().size(); i++) {
			
			repository.getAllMembers().get(i).pay();
			
		}
		
	}

	//get info method
	public String getAllEmployees() {
		
		for (int i = 0; i < repository.getAllMembers().size(); i++) {
			
			System.out.println(repository.getAllMembers().get(i).toString());
			
		}
		
		return "\n" + repository.getAllMembers() + "]";
		
				
	}

	
}
