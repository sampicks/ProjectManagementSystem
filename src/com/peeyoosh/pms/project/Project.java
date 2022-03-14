package com.peeyoosh.pms.project;

import java.util.Date;
import java.util.List;

import com.peeyoosh.pms.employee.Employee;

public class Project {

	private String projectName;
	private ProjectType projectType;
	private Date dateCreated;
	private List<Employee> teamMembers;
	private Employee projectManager;
	
}
