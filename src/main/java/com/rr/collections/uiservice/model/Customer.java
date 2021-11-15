package com.rr.collections.uiservice.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postCode;
    private String createdTime;
    private Boolean enabled;
    private String verificationCode;

}
