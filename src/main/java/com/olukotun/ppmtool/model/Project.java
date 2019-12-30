package com.olukotun.ppmtool.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String projectName;
	private String projectIdentifier;
	private String description;
	private Date start_Date;
	private Date end_Date;
	
	private Date created_At;
	private Date updated_At;
	
	
	@PrePersist
	protected void onCreate() {
		this.created_At = new Date();     //any time a new object is created it is going to create a date
		}
	
	
	@PreUpdate
	protected void onUpdate() {
		this.updated_At = new Date();  // any time an updated state is created it is going to update the date to current date
	}
	
	
	
	
	
	
	
	
	
	

}
