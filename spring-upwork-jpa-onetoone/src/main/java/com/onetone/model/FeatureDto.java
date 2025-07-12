package com.onetone.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeatureDto {


private Integer featureId;	
private String mode; // online/offline
private String jobtype; // parttime/fulltime
private String description;
private String role; // contract/permanent

// Getters and Setters
}