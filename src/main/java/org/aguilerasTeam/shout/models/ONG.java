package org.aguilerasTeam.shout.models;

public class ONG {

    private String name;
    private String email;
    private Integer account;

    public ONG(String name, String email){
        this.name = name;
        this.email = email;
        account = 0;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAccount() {
        return account;
    }

}
