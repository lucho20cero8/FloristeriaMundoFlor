package com.floristeriamundoflor.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/productosCumpleaños.feature",
        glue = "com.floristeriamundoflor.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)



public class Runner {

}
