package com.njust.service;

import com.njust.pojo.User;

public interface LoginService {
  public User login(String userCode, String userPassword) ;
}
