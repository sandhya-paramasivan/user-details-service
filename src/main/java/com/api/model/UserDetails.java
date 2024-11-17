package com.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class UserDetails {

    private String userId;
    private String username;
    private int claimedQuantity;
    private Address address;

}
