package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	
	
	public static void takeLogs(String classname, String logMsg)
	
	{
		DOMConfigurator.configure("../NewProject/layout.xml");
		Logger L = Logger.getLogger(classname);
		L.info(logMsg);
	}
	

}
