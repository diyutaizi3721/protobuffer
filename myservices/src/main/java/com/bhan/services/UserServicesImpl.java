package com.bhan.services;

import java.util.List;

import com.bhan.dao.user.IUserDao;
import com.bhan.pojo.Users;


/**
 * 
 * @author bhan
 * 
 */
public class UserServicesImpl implements IUserServices {

	private IUserDao userDao;

	public void addUsers(Users user) {
		//userDao.save(user);
	}
	
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getUserList();
	}

	/*public boolean getUsers(ReqestUserCommand requestUser, Builder builder) {
		// TODO Auto-generated method stub

		String userId = requestUser.getUserId();
		Users users = (Users) userDao.getUser(userId);

		if (null != users) {
			CustomerManager.UsersCommand.Builder userBuilder = CustomerManager.UsersCommand
					.newBuilder();
			userBuilder.setUserId(users.getUserId());
			userBuilder.setUserName(users.getUserName());

			if (!users.getGender().equals("")) {
				if (users.getGender().equals("man")) {
					userBuilder.setGender(CustomerManager.UsersCommand.GenderCommand.MAN);
				} else {
					userBuilder.setGender(CustomerManager.UsersCommand.GenderCommand.FEMALE);
				}
			}

			builder.setUser(userBuilder);
		} else {
			return false;
		}

		return true;
	}*/

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
}
