package com.demo.banking;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary/DemoHomepageDefinition.feature")
public class DefinitionHomepageTestSuite {

}
