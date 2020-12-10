package org.aguilerasTeam.shout.services;


import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.Users;

import java.util.Date;
import java.util.List;

public class EventsServices {

    private ProductsServices productsServices;
    private ONGServices ongServices;
    private Users currentUser;
    private UsersServices usersServices; //SETTAR NA MAIN

    //private List<Events> eventsList = usersServices.getCurrentUser().getEventsList();

    public void creteNewEvent(String name, Integer maxvalue, String description, Date date){
        Events event = new Events(name, maxvalue, description, date);
        event.getUserList().add(currentUser);
        //eventsList.add(event);
        currentUser.getEventsList().add(event);
    }

    public void addUser(String name, Users user){ //POPULATE EVENT
        List<Events> eventsList = currentUser.getEventsList();
        for(Events event : eventsList) {
            if(name.equals(event.getName())) {
                event.addUser(user);
                user.getEventsList().add(event);
                System.out.println("ADICIONADO BROOOOO");
                return;
            }
        }
        System.out.println("AHHAHHAHAH");
    }

    public void makePayment(Integer amount){
        if(amount <= currentUser.getAccount()) {
            currentUser.setAccount(-amount);
            productsServices.
        }
    }

    public List<Events> getEventsList() {
        return currentUser.getEventsList();
    }


    public UsersServices getUsersServices() {
        return usersServices;
    }

    public void setUsersServices(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    public Users getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Users currentUser) {
        this.currentUser = currentUser;
    }

    public void setProductsServices(ProductsServices productsServices) {
        this.productsServices = productsServices;
    }

    public ONGServices getOngServices() {
        return ongServices;
    }

    public void setOngServices(ONGServices ongServices) {
        this.ongServices = ongServices;
    }
}
