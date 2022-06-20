package com.logo.Controller;

import com.logo.Model.Customer;
import com.logo.Model.User;
import com.logo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User userRequest) {
        return userService.createUser(userRequest);
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

    @GetMapping("/{email}/customers")
    public List<Customer> getCustomersUserByEmail(@PathVariable String email){
        return userService.getCustomersByEmail(email);
    }
}
