package com.bhan.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author bhan
 *
 */
public class HandlerControllerTest{
	
	private static Logger  log=LoggerFactory.getLogger(HandlerControllerTest.class);
	
	public  void corrupt(){
		
		String name = "allegation"; 
		log.trace("------HandlerControllerTest-----trace");
        log.info("------Hello from corrupt.");  
        log.warn("------HandlerControllerTest-----warn");  
        log.debug("------My name is {}", name);
        log.error("------My name is {}", name);
		
	}
	
	
}