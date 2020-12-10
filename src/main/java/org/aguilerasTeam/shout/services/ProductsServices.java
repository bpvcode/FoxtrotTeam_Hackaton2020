package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.ONG;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;

import java.util.LinkedList;
import java.util.List;

public class ProductsServices {


    private Users currentUser;
    private List<ONG> ongList;
    private List<Products> productsList = new LinkedList<>();
    private List<Products[]> listWishLists;
    private List<Events> eventsList;

    public void matchWishListToEvent(String eventName){
        for(Events event : eventsList) {
            if(eventName.equals(event.getName())) {

            }
        }
    }

    public void addNewProduct(Products product1, Products product2, Products product3){
        Products[] wishList = new Products[]{product1,product2,product3};
        currentUser.getListOfwhishLists().add(wishList);

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
        listWishLists = currentUser.getListOfwhishLists();
    }


    public void setOngList(List<ONG> ongList) {
        this.ongList = ongList;
    }

    public List<ONG> getOngList() {
        return ongList;
    }


    public List<Products[]> getListWishLists() {
        return listWishLists;
    }

    public void setListWishLists(List<Products[]> listWishLists) {
        this.listWishLists = listWishLists;
    }

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }
}
