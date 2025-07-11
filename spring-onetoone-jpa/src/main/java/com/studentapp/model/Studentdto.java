package com.studentapp.model;


import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studentdto {
    private Integer studentId;
    private String studentName;
    private String department;
    private Addressdto  address;
}
