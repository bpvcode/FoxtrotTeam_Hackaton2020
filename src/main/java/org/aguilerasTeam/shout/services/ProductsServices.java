package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.ONG;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;

import java.util.LinkedList;
import java.util.List;

public class ProductsServices {


    private Users currentUser;
    private UsersServices usersServices; //SETTAR MAIN

    private List<Products> productsList = new LinkedList<>();

    public void addNewProduct(String name, String email){ //BRUNO

    }


    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public Users getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Users currentUser) {
        this.currentUser = currentUser;
    }
}
