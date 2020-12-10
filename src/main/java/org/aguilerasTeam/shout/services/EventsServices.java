package org.aguilerasTeam.shout.services;


import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.ONG;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;

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

    public void creteNewEvent(String name, Integer maxvalue, String description, Date date, Integer id){
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

    public void finishEvent(Events event){ //POR TESTAR
        usersList = event.getUserList();
        List<Users> giftedList = event.getUserList();
        for(Users users : usersList){
            int number = giftedList.size();
            Users chosenOne = giftedList.get((int)(Math.random() * number));
            if(users == chosenOne && number!=1){
                while(users == chosenOne){
                    chosenOne = giftedList.get((int)(Math.random() * number));
                }
            }
            users.getUsersList().put(chosenOne,event.getId());
            giftedList.remove(chosenOne);
        }
    }

    public void makePayment(Integer amount, Integer index, Integer indexPresent){
        if(amount <= currentUser.getAccount()) {
            currentUser.setAccount(-amount);
            currentUser.getKey(currentUser.getUsersList(),index).getWishList().get(index).getWishList()[indexPresent].getOng().addMoney(amount);
            //productsServices.getProductsList();
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
