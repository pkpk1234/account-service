package com.example.accountservice;

import com.example.accountservice.model.account.Account;
import com.example.accountservice.model.address.Address;
import com.example.accountservice.model.address.AddressType;
import com.example.accountservice.model.creditcard.CreditCard;
import com.example.accountservice.model.creditcard.CreditCardType;
import com.example.accountservice.model.customer.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AccountServiceApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Before
    public void initSampleData() {
        Address address1 = new Address("jinniu", "yinbingdadao", "sichuan", "chengdu", 610000, AddressType.BILLING);
        Address address2 = new Address("jinniu", "shuyuelu", "sichuan", "chengdu", 610000, AddressType.SHPPING);
        Address address3 = new Address("jinniu", "shuhanlu", "sichuan", "chengdu", 610000, AddressType.BILLING);

        CreditCard masterCard = new CreditCard("123456", CreditCardType.MASTERCARD);
        CreditCard vtsaCard = new CreditCard("321654",CreditCardType.VISA);

        Account account1 = new Account("account1");

    }

    @Test
    public void contextLoads() {
    }

}
