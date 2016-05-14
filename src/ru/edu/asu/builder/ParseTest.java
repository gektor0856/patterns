package ru.edu.asu.builder;

import java.util.ArrayList;

public class ParseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProjectConverter converter = new ProjectConverter();
		DocReader reader = new DocReader(converter, "projects.xml");
		reader.build();
		ArrayList<Project> projectList = converter.getProjectList();
		System.out.println("------- ������ Email ---------");
		for (Project project : projectList) {
			System.out.println(project.getTutormail());
		}
		
		System.out.println("------- ������ ������������� ---------");
		for (Project project : projectList) {
			System.out.println(project.getTutorname());
		}
		
//		ProjectConverter emailBuilder = new ProjectConverter();
//		DocReader reader = new DocReader(emailBuilder, "projects.xml");
//		reader.build();
//		ArrayList<String> emailList = emailBuilder.getEmailList();
//		System.out.println("------- ������ Email ---------");
//		for (String email : emailList) {
//			System.out.println(email);
//		}
//		SupervisorConverter supervisorConverter = new SupervisorConverter();
//		reader = new DocReader(supervisorConverter, "projects.xml");
//		reader.build();
//		ArrayList<String> supervisorList = supervisorConverter.getSupervisors();
//		System.out.println("--------- ������ ������������� ---------");
//		for (String supervisor : supervisorList) {
//			System.out.println(supervisor);
//		}
		
		
	}

}
