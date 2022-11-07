package com.suptech.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) { }
