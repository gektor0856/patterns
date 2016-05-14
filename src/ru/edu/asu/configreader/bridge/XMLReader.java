package ru.edu.asu.configreader.bridge;

import ru.edu.asu.configreader.xml.XMLBuildConfigurationReader;

public class XMLReader implements ConfigReader {

	@Override
	public void readConfig() {
		XMLBuildConfigurationReader buildConfigurationReader = new XMLBuildConfigurationReader("build.xml");
		System.out.println("XML Build config: "+buildConfigurationReader.getProject());

	}

}
