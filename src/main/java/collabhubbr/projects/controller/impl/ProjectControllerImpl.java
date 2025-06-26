package collabhubbr.projects.controller.impl;

import collabhubbr.projects.controller.DTO.RequestProjectDTO;
import collabhubbr.projects.controller.DTO.ResponseProjectDTO;
import collabhubbr.projects.controller.ProjectController;
import collabhubbr.projects.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProjectControllerImpl implements ProjectController {
    private final ProjectService projectService;

    @Override
    public ResponseEntity<ResponseProjectDTO> createRepoProject(RequestProjectDTO project) {
        return ResponseEntity.ok().body(
                projectService.createProject(project)
        );
    }
}
