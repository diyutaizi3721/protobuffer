package com.bhan.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.bhan.pojo.Users;
import com.bhan.services.IUserServices;

/**
 * 
 * @author bhan
 * 
 */
public class HandlerController extends MultiActionController {

	private IUserServices userServices;
	private Logger logger=LoggerFactory.getLogger(HandlerController.class);

	public ModelAndView save(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		logger.info("begin spring mvc request save....");
		
		Users user = new Users();
		
		//userServices.addUsers(user);

		List<Users> userList = userServices.getAllUsers();

		ModelAndView model = new ModelAndView();
		model.addObject("userList", userList);
		model.setViewName("detail");
		
		
		logger.info("end spring mvc request save....");
		return model;
	}
	
	public ModelAndView forwardPage(HttpServletRequest request,
			HttpServletResponse response){
		return new ModelAndView("index");
	}

	public IUserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(IUserServices userServices) {
		this.userServices = userServices;
	}

}
