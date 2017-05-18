package com.example.accountservice.model.account;

import com.example.accountservice.model.address.Address;
import com.example.accountservice.model.BaseEntity;
import com.example.accountservice.model.creditcard.CreditCard;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pkpk1234 on 2017/5/18.
 */
@Entity
public class Account extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String accountNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<CreditCard> creditCards;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Address> addresses;

    public Account() {
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.creditCards = new HashSet<>();
        this.addresses = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", creditCards=" + creditCards +
                ", addresses=" + addresses +
                '}';
    }
}
