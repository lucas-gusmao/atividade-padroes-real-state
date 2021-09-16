package br.edu.ifpb.padroes.domain;

public class Bungalow implements Property {

    private float price;
    private String address;
    private String builder;

    public Bungalow(float price, String address, String builder) {
		this.price = price;
		this.address = address;
		this.builder = builder;
	}
	@Override
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBuilder() {
        return builder;
    }
    public void setBuilder(String builder) {
        this.builder = builder;
    }

}
