package com.simplilearn.bddtest.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/login.feature", 
	glue = {"com/simplilearn/bddtest/stepdefinitions"})
public class LoginTestRunner {

}
