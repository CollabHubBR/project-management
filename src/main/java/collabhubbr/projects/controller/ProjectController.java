package collabhubbr.projects.controller;

import collabhubbr.projects.DTO.RequestProjectDTO;
import collabhubbr.projects.DTO.ResponseProjectDTO;
import collabhubbr.projects.model.Project;
import collabhubbr.projects.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
@AllArgsConstructor
public class ProjectController {
    private ProjectService projectService;

    @PostMapping("/create")
    public ResponseEntity<ResponseProjectDTO> createRepoProject(@RequestBody RequestProjectDTO project) {
        return ResponseEntity.ok().body(
                projectService.createProject(project)
        );
    }
}
