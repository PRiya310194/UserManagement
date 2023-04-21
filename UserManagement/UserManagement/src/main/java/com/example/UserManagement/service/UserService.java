package com.example.UserManagement.service;

import com.example.UserManagement.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    private static List<User> users=new ArrayList<>();

    private static int userCount=0;
    static{
        users.add(new User(++userCount,"Ram","Shyam","Patna", 8888888));
        users.add(new User(++userCount,"Sita","Rahul","Ranchi", 9999999));
        users.add(new User(++userCount,"Rani","Gudula","Delhi", 77777777));
        users.add(new User(++userCount,"Priya","Shyam","jaipur", 6666666));
        users.add(new User(++userCount,"Shanti","Shyam","Charlatan", 666666));
        users.add(new User(++userCount,"Ashanti","Shyam","Patna", 5555555));

    }
    public List<User>findAll(){
        return users;
    }
    public User findById(int id){
        // java logic
        Predicate<? super User> predicate= todo -> todo.getId()==id;   // business logic
        User user=users.stream().filter(predicate).findFirst().get();
        return user;
    }
    public void addUser(User user){
        users.add(user);
    }
    public void deleteUser(int id){
        Predicate<? super User> predicate=todo -> todo.getId()==id;
        users.removeIf(predicate);
        //todos.remove();
    }
    public void updateUser(int id,User newUser){
        // get todo
        // find todo to be updated
        User user=findById(id);
        user.setId(newUser.getId());
        user.setName(newUser.getName());
        user.setUser_name(newUser.getUser_name());
        user.setUser_name(newUser.getUser_name());
        user.setAddress(newUser.getAddress());
        user.setPhone_number(newUser.getPhone_number());

    }

}

