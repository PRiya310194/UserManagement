package com.example.UserManagement.model;

public class User {
    private int id;
    private String name;
    private String user_name;
    private String address;
    private int phone_number;

    public User(int id, String name, String user_name, String address, int phone_number) {
        this.id = id;
        this.name = name;
        this.user_name = user_name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
