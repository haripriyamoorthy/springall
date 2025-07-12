package com.onetone.model;

import java.util.Set;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobDto {


private Integer jobId;	
private String time;
private double rate;
private String location;
private FeatureDto features;

// Getters and Setters

}