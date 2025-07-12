package com.onetone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Features {
@Id
@GeneratedValue(generator = "upwork_gen",strategy = GenerationType.AUTO)
@SequenceGenerator(name = "upwork_gen",sequenceName = "upwork_seq",initialValue = 51)
private Integer featureId;

private String mode;// online/offline

private String jobType; // parttime/fulltime
@Column(length = 50)
private String description;

private String role; // contract/permanent

// Getters and Setters
}
