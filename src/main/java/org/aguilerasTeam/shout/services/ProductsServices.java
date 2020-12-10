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
    private List<Events> eventsList;
    private List<Products> productsList = new LinkedList<>();

    public void matchWishListToEvent(Integer id, Products[] products){
        for(Events event : eventsList) {
            if(event.getMaxvalue()>= products[0].getTotalPrice() && event.getMaxvalue()>= products[1].getTotalPrice() && event.getMaxvalue()>= products[2].getTotalPrice()) {
                currentUser.getWishList().get(id).setId(event.getId());
            }
        }
    }

    public void addNewProduct(Products product1, Products product2, Products product3, Integer id){
        Products[] wishList = new Products[]{product1,product2,product3};
        currentUser.getWishList().get(id).setWishList(wishList);

    }

    public void addProduct(Products products){
        productsList.add(products);
    }

    public Users getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Users currentUser) {
        this.currentUser = currentUser;
        eventsList = currentUser.getEventsList();
    }

    public void setOngList(List<ONG> ongList) {
        this.ongList = ongList;
    }

    public List<ONG> getOngList() {
        return ongList;
    }

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }
}
