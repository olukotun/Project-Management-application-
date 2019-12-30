package com.olukotun.ppmtool.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.olukotun.ppmtool.model.Project;
import com.olukotun.ppmtool.services.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
 
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("")
	public ResponseEntity<Project> createNewObject(@RequestBody Project project){
		Project project1 = projectService.saveorUpdateProject(project);
		return new ResponseEntity<Project>(project1,HttpStatus.CREATED);
	}
	
}
