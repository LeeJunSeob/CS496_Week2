package com.example.q.cs496_app1.tabs.contact;

public class ContactItem {
    int image;
    String name;
    String phoneNumber;
    String email;

    public ContactItem(int image, String name, String phoneNumber, String email) {
        this.image = image;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() { return email; }
}
