package com.services;

import java.util.List;

import com.beans.User;
import com.beans.UserAddress;

public interface UserService
{
    public Integer saveUserAddress(UserAddress userAddress);

    public UserAddress getUserAddress(Integer addressId);

    public void saveUser(User user);

    public List<User> getUser(String userName, String password);
}
