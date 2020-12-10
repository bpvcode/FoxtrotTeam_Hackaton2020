package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.ONG;
import org.aguilerasTeam.shout.models.Users;

import java.util.List;

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


    public void distributeONG(){
        productsServices.setOngList(ongServices.getOngList());
        eventsServices.setOngList(ongServices.getOngList());
    }

    public void distributeProducts(){
        eventsServices.setProductsList(productsServices.getProductsList());
    }

    public void distributeEvents(){
        productsServices.setEventsList(eventsServices.getEventsList());
    }

    public void setUsersServices(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    public void setEventsServices(EventsServices eventsServices) {
        this.eventsServices = eventsServices;
    }

    public void setOngServices(ONGServices ongServices) {
        this.ongServices = ongServices;
    }

    public void setProductsServices(ProductsServices productsServices) {
        this.productsServices = productsServices;
    }
}
