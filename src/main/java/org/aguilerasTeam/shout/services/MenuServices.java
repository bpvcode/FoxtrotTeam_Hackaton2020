package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.Users;

public class MenuServices {

    private Users currentUser;
    private UsersServices usersServices;
    private EventsServices eventsServices;
    private ONGServices ongServices;
    private ProductsServices productsServices;


    public void setCurrentUser(Users loginUser) {
        currentUser= loginUser;
    }

    public void distributeCurrentUser(){
        usersServices.setCurrentUser(currentUser);
        productsServices.setCurrentUser(currentUser);
        eventsServices.setCurrentUser(currentUser);
    }

}
