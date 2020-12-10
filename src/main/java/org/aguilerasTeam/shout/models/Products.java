package org.aguilerasTeam.shout.models;

public class Products {

    private String name;
    private Integer productPrice;
    private ONG ong;

    public Products(String name, Integer productPrice, ONG ong){
        this.name = name;
        this.productPrice = productPrice;
        this.ong = ong;
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

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }
}
