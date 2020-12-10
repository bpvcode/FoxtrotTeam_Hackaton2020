package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;

public class UsersServices {

    private Users currentUser;
    private ONGServices ongServices; //BRUNO

    public void addMoney(Integer amount){
        currentUser.setAccount(amount);
    }


    public void addEvent(Events event){
        currentUser.getEventsList().add(event);
    }

    public void createWhishList(Products[] wishList){
        currentUser.setWishList(wishList);
    }

    public void buyGift(Integer amount){
        if(amount<= currentUser.getAccount()) {
            currentUser.setAccount(-amount);
            currentUser.setBought(true);
        }
    }

    public void setCurrentUser(Users loginUser) {
        currentUser= loginUser;
    }

    public Users getCurrentUser() {
        return currentUser;
    }
}
