package com.olukotun.ppmtool.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Project name is required")
	private String projectName;
	
	@NotBlank(message="Project identifier is required")
	@Size(min=4, max=5, message="please use 4 t0 5 characters")
	@Column(updatable = false, unique = true)
	private String projectIdentifier;
	
	@NotBlank(message="Project description is required")
	private String description;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date start_Date;
	
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date end_Date;
	
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date created_At;
	
	@JsonFormat (pattern="yyyy-mm-dd")
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
