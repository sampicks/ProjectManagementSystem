package com.peeyoosh.pms;

import java.util.ArrayList;
import java.util.List;

import com.peeyoosh.pms.employee.Employee;
import com.peeyoosh.pms.employee.developer.Developer;
import com.peeyoosh.pms.employee.manager.ProjectManager;
import com.peeyoosh.pms.information.Address;
import com.peeyoosh.pms.information.PersonalInformation;
import com.peeyoosh.pms.project.Project;
import com.peeyoosh.pms.project.ProjectType;

public class Admin {

	private Employee createDeveloper(String fname, String sname) {
		Employee employee = new Developer(
				new PersonalInformation(fname, sname, getAddress("local street", "Pune", "Maharastra"), "02/02/2015"));
		return employee;
	}

	private Employee createProjectManger(String fname, String sname) {
		Employee employee = new ProjectManager(
				new PersonalInformation(fname, sname, getAddress("local street", "Pune", "Maharastra"), "02/02/2015"));
		return employee;
	}

	private Address getAddress(String street, String city, String state) {
		return new Address.AddressBuilder(street, city).setState(state).build();
	}

	public static void main(String[] args) {
		Project project1 = new Project("Traffic control system", ProjectType.WEB);
		project1.setDateCreated("30/04/2015");

		Admin admin = new Admin();

		List<Employee> developers = new ArrayList<>();
		developers.add(admin.createDeveloper("Anil", "Gupta"));
		developers.add(admin.createDeveloper("Mukesh", "Sahni"));
		developers.add(admin.createDeveloper("Rupika", "Arora"));

		project1.setProjectManager(admin.createProjectManger("Karthik", "Reddy"));
		project1.setTeamMembers(developers);
		
		System.out.println(project1);
	}

}
