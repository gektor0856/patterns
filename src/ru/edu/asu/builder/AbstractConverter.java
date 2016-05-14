package ru.edu.asu.builder;

import java.util.ArrayList;

public abstract class AbstractConverter implements NodeConverter {

	public AbstractConverter() {
		super();
	}

	@Override
	public abstract void addProject(Project project);

	@Override
	public  abstract ArrayList<Project> getProjectList();


}