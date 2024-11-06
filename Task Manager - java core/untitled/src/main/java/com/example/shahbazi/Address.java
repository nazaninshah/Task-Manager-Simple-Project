package com.example.shahbazi;

public class Address implements Comparable<Address>{
    private String country;
    private String city;
    private String street;
    private int houseNumber;

    public Address(String country, String city, String street, int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    @Override
    public int compareTo(Address a) {
        return this.houseNumber - a.houseNumber;
    }

    @Override
    public String toString() {
        return "Address{ country= " + country + ", city= " + city + ", street= " + street + ", houseNumber= " + houseNumber + "}";
    }
}
