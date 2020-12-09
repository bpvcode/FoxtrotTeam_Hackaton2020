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
    private Products[] wishList = new Products[3];
    private List<Events> eventsList = new LinkedList<>();
    private boolean isBought;


    public Users(String username, String password, String firstName, String lastName, String email, Integer account){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.account = account;

    }

    public void addEvent(Events event){
        eventsList.add(event);
    }

    public void createWhishList(Products[] wishList){
        this.wishList = wishList;
    }

    public void buyGift(Integer amount){
        if(amount<= account) {
            account -= amount;
            isBought = true;
        }
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
        for(int i=0; i<wishList.length; i++){
            System.out.println(wishList[i]);
        }
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
        this.account = account;
    }
}
