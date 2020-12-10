package org.aguilerasTeam.shout.models;

public class Products {

    private String name;
    private Integer totalPrice;
    private Integer productPrice;
    private ONG ong;
    private Integer donation;
    private long reward;

    public Products(String name, Integer productPrice, ONG ong, Integer donation){
        this.name = name;
        this.productPrice = productPrice;
        this.ong = ong;
        this.donation = donation; //NEED CONDITION
        totalPrice = productPrice + donation; // = MAX VALUE
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ONG getOng() {
        return ong;
    }

    public void setOng(ONG ong) {
        this.ong = ong;
    }



    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getDonation() {
        return donation;
    }

    public void setDonation(Integer donation) {
        this.donation = donation;
    }
}
