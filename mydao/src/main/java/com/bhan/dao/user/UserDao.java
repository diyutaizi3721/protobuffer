package com.bhan.dao.user;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhan.dao.mapper.UserMapper;
import com.bhan.pojo.Users;

/**
 * 
 * @author bhan
 *
 */
public class UserDao implements IUserDao{

	private Logger logger=LoggerFactory.getLogger(UserDao.class);
	
	private UserMapper userMapper;
	
	

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<Users> getUserList() {
		logger.info("query user list start");
		return userMapper.getUsersList();
		
	}
	
	
	
}
