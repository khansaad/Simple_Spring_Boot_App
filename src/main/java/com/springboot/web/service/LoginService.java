package com.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
    public boolean validateUser(String user, String password) {
    	
        return user.equalsIgnoreCase("saad") && password.equals("test");
    }
}
