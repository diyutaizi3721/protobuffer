package com.bhan.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bhan.pojo.Users;
import com.bhan.services.IUserServices;
/**
 * 
 * @author bhan
 *
 */
public class UserInfoAbstractController extends AbstractController {

	private IUserServices userServices;
	private Logger logger=LoggerFactory.getLogger(UserInfoAbstractController.class);
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Users user = new Users();
		

		userServices.addUsers(user);

		List<Users> userList = userServices.getAllUsers();

		ModelAndView model = new ModelAndView();
		model.addObject("userList", userList);
		model.setViewName("detail");
		
		
		logger.info("end spring mvc request save....");
		return model;
	}

}
