package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;
import org.aguilerasTeam.shout.models.WishList;

public class UsersServices {

    private Users currentUser;
    private ONGServices ongServices;//BRUNO
    private WishList wishList;

    public void addMoney(Integer amount){
        currentUser.setAccount(amount);
    }

    public void createWishList(Products[] wishList, Integer i){
        currentUser.getWishList().get(i).setWishList(wishList);
    }

    public void setCurrentUser(Users loginUser) {
        currentUser= loginUser;
    }

    public Users getCurrentUser() {
        return currentUser;
    }
}
