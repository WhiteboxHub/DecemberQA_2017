package com.wbl;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/feature"},
                  glue = {"com.wbl.stepdefinition"},
                  dryRun= false,
                  tags= {"@second"}
                 )          
public class RunCukesTest {

}


//Tags which are comma separated are ORed. {"@second, @third"}
//Tags work as and when individually seperated by comma {"@second","@retest"}

//https://cucumber.io/docs/reference/jvm#running-cucumber




/*
 * runcukes -> features -> stepdefinition
 * Hooks ....@before 
 * 
 * before ---> HooksWBL  ---> static block --> ConfigUtils  properties loaded
 *  in before driver and url are loaded
 * @given 
 * @when
 * @then
 * 
 * 
 * 
 * 
 * 
 * 
 */
