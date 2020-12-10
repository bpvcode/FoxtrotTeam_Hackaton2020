package org.aguilerasTeam.shout.services;

import org.aguilerasTeam.shout.models.ONG;
import java.util.LinkedList;
import java.util.List;

public class ONGServices {

    private List<ONG> ongList = new LinkedList<>();

    public void addNewOng(String name, String email){
        ONG ong = new ONG(name, email);
        ongList.add(ong);
    }

    public List<ONG> getOngList() {
        return ongList;
    }

    public void setOngList(List<ONG> ongList) {
        this.ongList = ongList;
    }
}
