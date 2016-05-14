package ru.edu.asu.configreader;

import ru.edu.asu.configreader.bridge.Configuration;
import ru.edu.asu.configreader.bridge.XMLReader;
import ru.edu.asu.configreader.bridge.YAMLReader;
import ru.edu.asu.configreader.factorymethod.Config;
import ru.edu.asu.configreader.factorymethod.ConfigMaker;
import ru.edu.asu.configreader.factorymethod.XMLConfigMaker;
import ru.edu.asu.configreader.factorymethod.YAMLConfigMaker;

public class ConfigurationReader {

	public static void main(String[] args) {
		
		//Фабричный метод
		ConfigMaker makerXML = new XMLConfigMaker();
		Config configXML = makerXML.readConfig();
		configXML.readConfig();
		
		ConfigMaker makerYaml = new YAMLConfigMaker();
		Config configYaml = makerYaml.readConfig();
		configYaml.readConfig();
		
		//Мост
		
		Configuration confXML = new Configuration(new XMLReader());
		confXML.buildConfig();
		
		Configuration confYaml = new Configuration(new YAMLReader());
		confYaml.buildConfig();
		
	}
}
