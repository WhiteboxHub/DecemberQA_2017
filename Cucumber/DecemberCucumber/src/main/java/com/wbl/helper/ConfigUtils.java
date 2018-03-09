package com.wbl.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigUtils {

	public static final Properties prop = new Properties();
	
	static Logger log = LogManager.getLogger(ConfigUtils.class);  //https://www.tutorialspoint.com/log4j/log4j_architecture.htm
	
	public ConfigUtils(String fileName){	
		try {
			prop.load(new FileInputStream(fileName));			
		} catch (IOException e) {
			log.error(e.getMessage());
		}		
	}
	
	public String getProperty(String key){
		return prop.getProperty(key);
	}
}


/*
 * log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!");
      log.error("Error Message!");
      log.fatal("Fatal Message!");
 */



