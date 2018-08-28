package com.hellokoding.auth.web;

import com.hellokoding.auth.model.User;
import com.hellokoding.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity<?> registration(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("passwordConfirm") String passwordConfirm) {
        User userForm = new User();
        userForm.setUsername(username);
        userForm.setPassword(password);
        userForm.setPasswordConfirm(passwordConfirm);
        System.out.println("userName: >>>" + userForm.getUsername());
        userService.save(userForm);
        System.out.println("Sending Response OK.....");
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
