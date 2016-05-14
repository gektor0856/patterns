package ru.edu.asu.configreader.factorymethod;

public class YAMLConfigMaker implements ConfigMaker {

	public Config readConfig() {
		return new YAMLConfig();
	}

}
