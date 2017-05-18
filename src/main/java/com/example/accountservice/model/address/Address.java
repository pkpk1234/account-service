package com.example.accountservice.model.address;

import com.example.accountservice.model.BaseEntity;

import javax.persistence.*;

/**
 * Created by pkpk1234 on 2017/5/18.
 */
@Entity
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street1;
    private String street2;
    private String state;
    private String country;
    private Integer zipCode;

    @Enumerated(EnumType.STRING)
    private AdressType adressType;

    public Address() {
    }

    public Address(String street1, String street2, String state, String country, Integer zipCode, AdressType adressType) {
        this.street1 = street1;
        this.street2 = street2;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.adressType = adressType;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                ", adressType=" + adressType +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public AdressType getAdressType() {
        return adressType;
    }

    public void setAdressType(AdressType adressType) {
        this.adressType = adressType;
    }
}
