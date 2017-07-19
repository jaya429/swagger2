package com.jaya.model;

/**
 * Created by jnaga1 on 7/19/2017.
 */
public class Contact {

    private String name;
    private String email;
    private String contact;
    private String license;
    private String licenseUrl;

    public Contact(String name, String email, String contact, String license, String licenseUrl) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.license = license;
        this.licenseUrl = licenseUrl;
    }
}
