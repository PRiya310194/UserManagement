package com.example.UserManagement.controller;

import com.example.UserManagement.model.User;
import com.example.UserManagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-management")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
this.userService=userService;
    }
    @PostMapping("add-user")
    public void addUser(@RequestBody User user) {
 userService.addUser(user);
    }

    @GetMapping("/find-user/id/{id}")
    public User findUserById(@PathVariable int id) {
        return userService.findById(id);
    }

    @GetMapping("/find-all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PutMapping("/update-user/id/{id}")

    public void updateUser(@PathVariable int id, @RequestBody User user) {
userService.updateUser(id,user);
    }

    @DeleteMapping("delete-user/id/{id}")
    public void deleteUser(@PathVariable int id) {
userService.deleteUser(id);
    }
}