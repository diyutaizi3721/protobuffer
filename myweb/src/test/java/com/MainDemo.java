package com;

import com.bhan.web.HandlerControllerTest;
import com.bhan.web_1.Reconciliation;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HandlerControllerTest controller=new HandlerControllerTest();
		 Reconciliation recon=new Reconciliation();
		 controller.corrupt();
		 recon.reconciliate();
		 
		 
	}

}
