package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuthServices {

    private MenuServices menuServices;

    private Set<Users> userSet = new HashSet<>();


    public void registUser(Users user) {

        userSet.add(user);
    }

    public boolean authenticateUser(String username, String password) {

        for(Users user : userSet) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                menuServices.setCurrentUser(user);
                menuServices.setRegisteredUsers(userSet);
                return true;
            }
        }
        return false;
    }

    @Autowired
    public void setMenuServices(MenuServices menuServices) {
        this.menuServices = menuServices;
    }
}
