package org.aguilerasTeam.shout.persistence;

import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;


import java.util.LinkedList;
import java.util.List;

public class DatabaseExample {

    private List<Users> usersList = new LinkedList<>();
    private List<Products> productsList = new LinkedList<>();

    public void addUser(Users user){
        usersList.add(user);
    }

    public void addProfessional(Products professional){
        productsList.add(professional);
    }

    public List<Users> getUsersList(){
        return usersList;
    }

    public List<Products> getProfessionals(){
        return productsList;
    }

}
