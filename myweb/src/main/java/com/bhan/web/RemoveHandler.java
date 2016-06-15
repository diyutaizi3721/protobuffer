package com.bhan.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.bhan.services.IUserServices;
/**
 * 
 * @author bhan
 *
 */
public class RemoveHandler extends MultiActionController {

	private IUserServices userServices;
	
	public ModelAndView remove(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		ModelAndView model=new ModelAndView();
		
		
		return model;
	}
	
	public IUserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(IUserServices userServices) {
		this.userServices = userServices;
	}
	
	
}
