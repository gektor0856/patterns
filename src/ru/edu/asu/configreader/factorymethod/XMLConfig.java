package ru.edu.asu.configreader.factorymethod;

import ru.edu.asu.configreader.xml.XMLBuildConfigurationReader;

public class XMLConfig implements Config {

	public void readConfig() {
		XMLBuildConfigurationReader buildConfigurationReader = new XMLBuildConfigurationReader("build.xml");
		System.out.println("XML Build config: "+buildConfigurationReader.getProject());
	}

}
