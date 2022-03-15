package com.peeyoosh.pms.project;

import java.util.Date;
import java.util.List;

import com.peeyoosh.pms.employee.Employee;
import com.peeyoosh.pms.employee.manager.ProjectManager;

public class Project {

	private String projectName;
	private ProjectType projectType;
	private String dateCreated; // For simplicity date is taken as string
	private List<Employee> teamMembers;
	private Employee projectManager;

	public Project(String projectName, ProjectType projectType) {
		super();
		this.projectName = projectName;
		this.projectType = projectType;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public List<Employee> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<Employee> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public Employee getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(Employee projectManager) {
		this.projectManager = projectManager;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectType=" + projectType.name() + ", dateCreated=" + dateCreated
				+ ", teamMembers=" + teamMembers.size() + "] created";
	}

	
}
