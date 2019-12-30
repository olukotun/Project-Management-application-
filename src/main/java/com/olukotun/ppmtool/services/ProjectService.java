package com.olukotun.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olukotun.ppmtool.model.Project;
import com.olukotun.ppmtool.repository.ProjectRepository;

// a service layer is neccesary so as to abstract our logic from our controller
@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository; 
	
	public Project saveorUpdateProject(Project project) {
		return projectRepository.save(project);
	}

}
