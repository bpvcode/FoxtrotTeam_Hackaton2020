package org.aguilerasTeam.shout.models;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Events {

    private List<Users> userList = new LinkedList<>();
    private Integer id;
    private String name;
    private Integer maxvalue;
    private String description;
    private Date date;

    public Events(String name, Integer maxvalue, String description, Date date, Integer id){
        this.name = name;
        this.maxvalue = maxvalue;
        this.description = description;
        this.date = date;
        this.id = id;
    }


    public void addUser(Users user){ //POPULATE EVENT
        userList.add(user);
    }

    public List<Users> getUserList() {
        return userList;
    }

    public void setUserList(List<Users> userList) {
        this.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(Integer maxvalue) {
        this.maxvalue = maxvalue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
