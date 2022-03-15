package com.peeyoosh.pms.employee.developer;

import com.peeyoosh.pms.employee.Employee;
import com.peeyoosh.pms.information.Information;

public class Developer implements Employee{

	private Information personInformation;

	public Developer(Information personInformation) {
		super();
		this.personInformation = personInformation;
	}

	public Information getPersonInformation() {
		return personInformation;
	}

	public void setPersonInformation(Information personInformation) {
		this.personInformation = personInformation;
	}
	
	
}
