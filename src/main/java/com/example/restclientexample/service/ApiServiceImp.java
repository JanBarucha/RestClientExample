package com.example.restclientexample.service;

import com.example.domain.User;
import com.example.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class ApiServiceImp implements ApiService{

    public RestTemplate restTemplate;

    public ApiServiceImp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        List<User> userData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?limi=" + limit, List.class);
        return userData;
    }
}

