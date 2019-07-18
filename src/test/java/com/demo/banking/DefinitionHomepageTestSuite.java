package com.demo.banking;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/consult_dictionary/001-DemoHomepageDefinition.feature", 
		"src/test/resources/features/consult_dictionary/002-BankingPageDefinition.feature"})
public class DefinitionHomepageTestSuite {}
