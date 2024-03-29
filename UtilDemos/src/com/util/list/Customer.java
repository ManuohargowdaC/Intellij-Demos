package com.util.list;

public class Customer {
    private String name;
    private int customId;
   private String city;

    public Customer() {
    }

    public Customer(String name, int customId, String city) {
        this.name = name;
        this.customId = customId;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomId() {
        return customId;
    }

    public void setCustomId(int customId) {
        this.customId = customId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customId=" + customId +
                ", city='" + city + '\'' +
                '}';
    }

}
