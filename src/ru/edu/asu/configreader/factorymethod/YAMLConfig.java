package ru.edu.asu.configreader.factorymethod;

import ru.edu.asu.configreader.yaml.YamlBuildConfigurationReader;

public class YAMLConfig implements Config {

	public void readConfig() {
		YamlBuildConfigurationReader yamlConfigReader = new YamlBuildConfigurationReader("build.yaml");
		System.out.println("Yaml build config: "+yamlConfigReader.getBuildConfig());
	}

}
