package org.aguilerasTeam.shout.services;


import org.aguilerasTeam.shout.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Set;
@Service
public class MenuServices {

    private Users currentUser;
    private Set<Users> registeredUsers;
    private UsersServices usersServices;
    private EventsServices eventsServices;
    private ONGServices ongServices;
    private ProductsServices productsServices;

    //@Autowired
    public void setCurrentUser(Users loginUser) {
        currentUser= loginUser;
    }


    public void distributeCurrentUser(@Valid Users user){
        usersServices.setCurrentUser(currentUser);
        productsServices.setCurrentUser(currentUser);
        eventsServices.setCurrentUser(currentUser);
    }


    public void distributeONG(){
        productsServices.setOngList(ongServices.getOngList());
        eventsServices.setOngList(ongServices.getOngList());
    }

    public void distributeEvents(){
        productsServices.setEventsList(eventsServices.getEventsList());
    }
    @Autowired
    public void setUsersServices(UsersServices usersServices) {
        this.usersServices = usersServices;
    }
    @Autowired
    public void setEventsServices(EventsServices eventsServices) {
        this.eventsServices = eventsServices;
    }
    @Autowired
    public void setOngServices(ONGServices ongServices) {
        this.ongServices = ongServices;
    }
    @Autowired
    public void setProductsServices(ProductsServices productsServices) {
        this.productsServices = productsServices;
    }
    //@Autowired
    public void setRegisteredUsers(Set<Users> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }
}
