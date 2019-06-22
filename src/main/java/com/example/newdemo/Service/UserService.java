package com.example.newdemo.Service;

import com.example.demonew.Entity.User;

public interface UserService {
 public User create(User u);
 public User[] retrieveName();
 public User update(User u);
 public void deleteByName(User u);
}
