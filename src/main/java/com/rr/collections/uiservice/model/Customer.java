package com.rr.collections.uiservice.model;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", length = 45, nullable = false, unique = true)
    private String email;

    @Column(name = "firstName", length = 45, nullable = false)
    private String firstName;

    @Column(name = "lastName", length = 45, nullable = false)
    private String lastName;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "phoneNumber", length = 15, nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "addressLine1", length = 64, nullable = false)
    private String addressLine1;

    @Column(name = "addressLine2", length = 64)
    private String addressLine2;

    @Column(name = "city", length = 45, nullable = false)
    private String city;

    @Column(name = "state", length = 45, nullable = false)
    private String state;

    @Column(name = "postCode")
    private String postCode;

    @Column(name = "createdTime")
    private String createdTime;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "verificationCode")
    private String verificationCode;

}
