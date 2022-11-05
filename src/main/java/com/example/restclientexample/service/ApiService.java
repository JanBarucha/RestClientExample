package com.example.restclientexample.service;

import com.example.domain.User;

import java.util.List;

public interface ApiService {

    public List<User> getUsers(Integer limit);
}
