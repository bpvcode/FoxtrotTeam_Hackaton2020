package org.aguilerasTeam.shout.models;

public class WishList {
    private Integer id;
    private Products[] wishList = new Products[3];
    private boolean isBought = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Products[] getWishList() {
        return wishList;
    }

    public void setWishList(Products[] wishList) {
        this.wishList = wishList;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }
}
