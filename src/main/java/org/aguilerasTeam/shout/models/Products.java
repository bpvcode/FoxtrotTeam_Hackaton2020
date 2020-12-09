package org.aguilerasTeam.shout.models;

public class Products {

    private String name;
    private Integer price;
    private ONG ong;
    private float donation;

    public Products(String name, Integer price, ONG ong, float donation){
        this.name = name;
        this.price = price;
        this.ong = ong;
        this.donation = donation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ONG getOng() {
        return ong;
    }

    public void setOng(ONG ong) {
        this.ong = ong;
    }

    public float getDonation() {
        return donation;
    }

    public void setDonation(float donation) {
        this.donation = donation;
    }
}
