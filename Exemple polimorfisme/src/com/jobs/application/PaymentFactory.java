package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	//metodo pago a boss
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override 
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	//metodo pago a employee
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
				
			}
		};
	}
	
	//metodo pago a manager
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
				
			}
		};
	}
}
