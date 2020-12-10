package org.aguilerasTeam.shout.models;


import java.util.LinkedList;
import java.util.List;

public class Users {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Integer account;
    private List<Products[]> listOfWishLists = new LinkedList<>();
    private Products[] wishList = new Products[3];
    private List<Events> eventsList = new LinkedList<>();
    private Integer moneyDonated;
    private boolean isBought;


    public Users(String username, String password, String firstName, String lastName, String email, Integer account){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.account = account;
        moneyDonated = 0;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {

        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", account='" + account + '\'' +
                "} ";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account += account;
    }

    public List<Products[]> getListOfwhishLists() {
        return listOfWishLists;
    }

    public void setListOfwhishLists(List<Products[]> listOfwhishLists) {
        this.listOfWishLists = listOfwhishLists;
    }

    public Integer getMoneyDonated() {
        return moneyDonated;
    }

    public void setMoneyDonated(Integer moneyDonated) {
        this.moneyDonated = moneyDonated;
    }
}
