package com.peeyoosh.pms.employee.manager;

import java.util.List;

import com.peeyoosh.pms.employee.Employee;
import com.peeyoosh.pms.information.Information;
import com.peeyoosh.pms.project.Project;

public class ProjectManager implements Employee {

	private List<Project> completedProjects;
	private List<Project> currentProjects;
	private Information personInformation;
	
	
	
	public ProjectManager(Information personInformation) {
		super();
		this.personInformation = personInformation;
	}
	
	public Information getPersonInformation() {
		return personInformation;
	}

	public void setPersonInformation(Information personInformation) {
		this.personInformation = personInformation;
	}

	public List<Project> getCompletedProjects() {
		return completedProjects;
	}
	public void setCompletedProjects(List<Project> completedProjects) {
		this.completedProjects = completedProjects;
	}
	public List<Project> getCurrentProjects() {
		return currentProjects;
	}
	public void setCurrentProjects(List<Project> currentProjects) {
		this.currentProjects = currentProjects;
	}

	
	
	
}
