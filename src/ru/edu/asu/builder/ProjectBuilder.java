package ru.edu.asu.builder;

class ProjectBuilder {
	
	String name;
	String debt;
	String title;
	String group;
	String tutorname;
	String tutormail;
	
	ProjectBuilder buildName(String n){
		this.name = n;
		return this;
	}
	
	ProjectBuilder buildDebt(String d){
		this.debt = d;
		return this;
	}
	
	ProjectBuilder buildTitle(String t){
		this.title = t;
		return this;
	}
	
	ProjectBuilder buildGroup(String g){
		this.group = g;
		return this;
	}
	
	ProjectBuilder buildTutorName(String tn){
		this.tutorname = tn;
		return this;
	}
	
	ProjectBuilder buildTutorMail(String tm){
		this.tutormail = tm;
		return this;
	}
	
	Project build(){
		Project project = new Project();
		project.setName(name);
		project.setDebt(debt);
		project.setGroup(group);
		project.setTitle(title);
		project.setTutorname(tutorname);
		project.setTutormail(tutormail);
		return project;
	}
	
}
