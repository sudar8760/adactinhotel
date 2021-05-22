package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\login.feature",glue= {"com.stepdefinition1"},monochrome=true,dryRun=false,plugin= {"progress","html:C:\\AdactinHotel\\target"})

public class TestRunner{

}
