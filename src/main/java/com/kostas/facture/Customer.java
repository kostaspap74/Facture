package com.kostas.facture;

public class Customer {
    private String fullname;
    private String address;

    public Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }
    public String getAddress() {
        return address;
    }
}
