package org.aguilerasTeam.shout.services;


import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.ONG;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;
import org.h2.engine.User;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

public class EventsServices {

    private ONGServices ongServices;
    private Users currentUser;
    private List<Users> usersList;
    private List<ONG> ongList;
    private List<Products> productsList;
    private List<Events> eventsList;

    public void createNewEvent(String name, Integer maxvalue, String description, Date date, Integer id){
        Events event = new Events(name, maxvalue, description, date, id);
        event.getUserList().add(currentUser);
        currentUser.getEventsList().add(event);
    }

    public void addUser(String name, Users user){ //POPULATE EVENT
        for(Events event : eventsList) {
            if(name.equals(event.getName())) {
                event.addUser(user);
                user.getEventsList().add(event);
                return;
            }
        }
    }

    public void finishEvent(Integer id){
        usersList = eventsList.get(id).getUserList();
        int number = usersList.size();
        Users[] user = new Users[number];
        user = usersList.toArray(user);
        for(Users users : usersList){
            Users chosenOne = null;
            while(chosenOne==null){
                number = (int)(Math.random() * usersList.size());
                chosenOne = user[number];
            }
            if(users == chosenOne && number != 1){
                while(users == chosenOne){
                    number = (int)(Math.random() * usersList.size());
                    chosenOne = user[number];
                }
            }
            users.getUsersList().put(chosenOne,id);
            user[number]=null;
        }
    }

    public void makePayment(Integer amount, Integer id, Integer indexPresent){
        if(amount <= currentUser.getAccount() && !currentUser.getKey(currentUser.getUsersList(),id).getWishList().get(id).isBought()) {
            currentUser.setAccount(-amount);
            int donation = eventsList.get(id).getMaxvalue()-amount;
            currentUser.getKey(currentUser.getUsersList(),id).getWishList().get(id).getWishList()[indexPresent].getOng().addMoney(donation);
            currentUser.getKey(currentUser.getUsersList(),id).getWishList().get(id).setBought(true);
        }
    }

    public List<Events> getEventsList() {
        return currentUser.getEventsList();
    }

    public Users getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Users currentUser) {
        this.currentUser = currentUser;
        eventsList = currentUser.getEventsList();
    }

    public ONGServices getOngServices() {
        return ongServices;
    }

    public void setOngServices(ONGServices ongServices) {
        this.ongServices = ongServices;
    }

    public List<ONG> getOngList() {
        return ongList;
    }

    public void setOngList(List<ONG> ongList) {
        this.ongList = ongList;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }
}
