package com.wbl.src;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
public  String propertiesExample(String str) throws IOException	{
	Properties	prop=new Properties();
	
	FileInputStream inputStream =new FileInputStream("C:/Users/Innovapath/Desktop/Book12");
	prop.load(inputStream);
	return prop.getProperty("city") ;
}
	
	
	

}
