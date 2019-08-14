package com.example.DTO;


import com.example.enumerations.ContactType;
import java.util.List;
import java.util.Objects;

public class ContactsDTO {
        private String name;
        private String phoneNumber;
        private String mobileNumber;
        private String email;
        private ContactType contactType;

        public ContactsDTO() {
        }

        public ContactsDTO( String name, String phoneNumber,
                         String mobileNumber, String email, ContactType contactType) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.mobileNumber = mobileNumber;
            this.email = email;
            this.contactType = contactType;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName(String name) {
            return this.name;
        }

        public String getPhoneNumber(String s) {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getMobileNumber(String s) {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getEmail(String s) {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public ContactType getContactType(String s) {
            return contactType;
        }

        public void setContactType(ContactType contactType) {
            this.contactType = contactType;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactsDTO that = (ContactsDTO) o;
        return name.equals(that.name) &&
                phoneNumber.equals(that.phoneNumber) &&
                mobileNumber.equals(that.mobileNumber) &&
                email.equals(that.email) &&
                contactType == that.contactType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, mobileNumber, email, contactType);
    }

    @Override
    public String toString() {
        return "ContactsDTO{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", mobileNumber=" + mobileNumber +
                ", email=" + email +
                ", contactType=" + contactType +
                '}';
    }
}
