package com.example.restclientexample.service;

import com.example.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApiServiceImpTest {

    @Autowired
    public ApiService apiService;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testgetUsers() throws Exception {

        List<User> userList = apiService.getUsers(3);
        assertEquals(10, userList.size());
    }
}