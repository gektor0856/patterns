package ru.edu.asu.configreader.bridge;

public class Configuration {
	ConfigReader configReader;

	public Configuration(ConfigReader reader) {
		configReader = reader;
	}
	
	public void buildConfig(){
		configReader.readConfig();
	}
}
