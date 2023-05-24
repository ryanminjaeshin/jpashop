package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

// JPA 내장될 수 있다 (어딘가에)
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // make it immutable
    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

}
