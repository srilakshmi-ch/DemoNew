package com.example.newdemo.Service;

import com.example.demonew.Entity.User;

public class UseServiceImpl implements UserService{

	@Override
	public User create(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User[] retrieveName() {
		User u=new User("lakshmi","f");
		User u2=new User("sri","f");
		User u3=new User("venkat","m");
		User u4=new User("basheera","f");
		User u5=new User("roshin","m");
		User[] s={u,u2,u3,u4,u5};
		
		return s;
	}

	@Override
	public User update(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByName(User u) {
		// TODO Auto-generated method stub
		
	}

}
