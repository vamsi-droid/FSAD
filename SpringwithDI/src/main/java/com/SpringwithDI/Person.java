package com.SpringwithDI;

public class Person {
	

	 private HomeLoan homeLoan;
  
	 
	 public Person() {
	System.out.println("Person class default Constructor");
}
	 
	 public HomeLoan getHomeLoan() {
		 return homeLoan;
	 }

	 public void setHomeLoan(HomeLoan homeLoan) {
		 this.homeLoan = homeLoan;
	 }

	 void emi() {
		homeLoan.homeLoanEmi();
	 }
}
