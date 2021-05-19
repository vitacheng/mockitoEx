package mockitoex.impl;

import mockitoex.UserService;
import mockitoex.dao.UserDAO;

public class UserServiceImpl implements UserService {

	UserDAO userDAO;

	@Override
	public boolean isExisted(int userId) {
		userDAO.isExisted(userId);
		return true;
	}
}
