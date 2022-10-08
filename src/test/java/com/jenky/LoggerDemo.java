package com.jenky;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class LoggerDemo {


	@Test
	public void logs()
	{

      Logger log = LogManager.getLogger("TestClass1");
      
      log.info("For information Only");
      log.debug("For Debug Only");
      log.error("Error Message for abhinav");


	}








}
