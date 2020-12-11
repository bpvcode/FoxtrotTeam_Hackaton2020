package org.aguilerasTeam.shout.models;


import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Users {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Integer account;
    private Map<Users,Integer> usersList = new HashMap<>();
    private List<WishList> wishList = new LinkedList<>();
    private List<Events> eventsList = new LinkedList<>();
    private Integer moneyDonated;


    public Users(String username, String password, String firstName, String lastName, String email, Integer account){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.account = account;
        moneyDonated = 0;

    }

    public Users(){}

    public String getUsername() {
        return username;
    }
    @Autowired
    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }
    @Autowired
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Autowired
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }
    @Autowired
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
    @Autowired
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Events> getEventsList() {
        return eventsList;
    }
    @Autowired
    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account += account;
    }

    public Integer getMoneyDonated() {
        return moneyDonated;
    }
    @Autowired
    public void setMoneyDonated(Integer moneyDonated) {
        this.moneyDonated = moneyDonated;
    }

    public List<WishList> getWishList() {
        return wishList;
    }
    @Autowired
    public void setWishList(List<WishList> wishList) {
        this.wishList = wishList;
    }

    public Map<Users,Integer> getUsersList() {
        return usersList;
    }
    @Autowired
    public void setUsersList(Map<Users,Integer> usersList) {
        this.usersList = usersList;
    }

    public Users getKey(Map<Users, Integer> map, Integer value) {
        for (Map.Entry<Users, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return null;
    }
}
