package com.revature.data;

public class UserDAOFactory {
	public UserDAO getUserDAO() {

		return new UserPostgres();
	}

}
