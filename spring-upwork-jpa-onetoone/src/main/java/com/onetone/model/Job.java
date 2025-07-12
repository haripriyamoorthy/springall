package com.onetone.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Job {
@Id
@GeneratedValue(generator = "upwork_gen",strategy = GenerationType.AUTO)
@SequenceGenerator(name = "upwork_gen",sequenceName = "upwork_seq",initialValue = 51)
private Integer jobId;

private String time;

private double rate;
@Column(length = 20)
private String location;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "features_id")
private Features features;

// Getters and Setters
}