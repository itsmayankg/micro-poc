package com.hellokoding.auth.web;

import com.hellokoding.auth.model.User;
import com.hellokoding.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.OPTIONS)
    public ResponseEntity<?> registration(@RequestBody User userForm) {
        System.out.println("userName: >>>" + userForm.getUsername());
        userService.save(userForm);
        System.out.println("Sending Response OK.....");
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
