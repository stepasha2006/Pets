package com.example.friends;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){

        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getDisplay(){
        return String.format("%s - %s", this.phoneNumber,this.name);

    }
}