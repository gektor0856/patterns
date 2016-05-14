package ru.edu.asu.builder;

import java.util.ArrayList;

public class ProjectConverter extends AbstractConverter implements
		NodeConverter {

	ArrayList<Project> projectList = new ArrayList<Project>();


	@Override
	public void addProject(Project project) {
		projectList.add(project);
	}

	@Override
	public ArrayList<Project> getProjectList() {
		return projectList;
	}


	

}
