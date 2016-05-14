package ru.edu.asu.configreader.factorymethod;

public class XMLConfigMaker implements ConfigMaker {

	public Config readConfig() {
		return new XMLConfig();
	}

}
