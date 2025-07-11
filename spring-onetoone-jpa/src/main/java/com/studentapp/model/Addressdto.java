package com.studentapp.model;



import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Addressdto {
    private Integer addressId;
    private String city;
    private String state;
    private String zipcode;
}

