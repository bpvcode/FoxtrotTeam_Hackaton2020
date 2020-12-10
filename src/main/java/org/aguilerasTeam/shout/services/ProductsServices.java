package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProductsServices {


    private Users currentUser;
    private List<ONG> ongList;
    private List<Events> eventsList;
    private List<Products> productsList = new LinkedList<>();

    public void matchWishListToEvent(Integer id, Products[] products){
        for(Events event : eventsList) {
            if(event.getMaxvalue()>= products[0].getProductPrice() && event.getMaxvalue()>= products[1].getProductPrice() && event.getMaxvalue()>= products[2].getProductPrice()) {
                currentUser.getWishList().get(id).setId(event.getId());
            }
        }
    }

    public Products[] getWishList(Integer id){
        return currentUser.getWishList().get(id).getWishList();
    }

    public void addNewProduct(Products product1, Products product2, Products product3, Integer id){
        Products[] wishList = new Products[]{product1,product2,product3};
        WishList realWishList = new WishList(wishList);
        currentUser.getWishList().add(realWishList);
    }

    public void addProduct(Products products){
        productsList.add(products);
    }

    public Users getCurrentUser() {
        return currentUser;
    }
    //@Autowired
    public void setCurrentUser(Users currentUser) {
        this.currentUser = currentUser;
        eventsList = currentUser.getEventsList();
    }
    //@Autowired
    public void setOngList(List<ONG> ongList) {
        this.ongList = ongList;
    }

    public List<ONG> getOngList() {
        return ongList;
    }

    public List<Events> getEventsList() {
        return eventsList;
    }
    //@Autowired
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
