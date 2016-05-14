package ru.edu.asu.configreader.bridge;

import ru.edu.asu.configreader.yaml.YamlBuildConfigurationReader;

public class YAMLReader implements ConfigReader {

	@Override
	public void readConfig() {
		YamlBuildConfigurationReader yamlConfigReader = new YamlBuildConfigurationReader("build.yaml");
		System.out.println("Yaml build config: "+yamlConfigReader.getBuildConfig());

	}

}
