package com.example.domains;

import com.example.enumerations.ContactType;

import java.util.Collections;
import java.util.List;

public class Contacts {
    private String name;
    private String phoneNumber;
    private String mobileNumber;
    private String email;
    private ContactType contactType;

    public Contacts() {
    }

    public Contacts( String name, String phoneNumber,
                     String mobileNumber, String email, ContactType contactType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.contactType = contactType;
    }

    public void setName(String firstName) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
       this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return name.equals(contacts.name) &&
                phoneNumber.equals(contacts.phoneNumber) &&
                mobileNumber.equals(contacts.mobileNumber) &&
                email.equals(contacts.email) &&
                contactType == contacts.contactType;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", mobileNumber=" + mobileNumber +
                ", email=" + email +
                ", contactType=" + contactType +
                '}';
    }
}
