package com.example.userservice.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Hotel {

    @Id
    private String id;
    private String name;
    private String location;
    private String about;
}
