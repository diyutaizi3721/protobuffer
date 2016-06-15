package com.bhan.web_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reconciliation {

	private static final Logger log=LoggerFactory.getLogger(Reconciliation.class);
	
	 public void reconciliate() {  
	        String name = "conciliate";  
	        log.trace("------Reconciliation----------trace");
	        log.warn("------Reconciliation=======warn");
	        log.info("------Hello from reconciliate");  
	        log.debug("------My name is {}", name);  
	        log.error("------An error occurred during the progress");  
	    }  
	
}
