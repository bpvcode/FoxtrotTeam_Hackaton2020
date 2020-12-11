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
    Users user1 = new Users("bpvcode", "xxx", "Bruno", "Vilar", "bruno@gmail.com", 100);

    public void setUserSet(Users user1){
        userSet.add(user1);
    }
    public void registUser(Users user) {

        userSet.add(user);
    }

    public boolean authenticateUser(String username, String password) {
        setUserSet(user1);
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
