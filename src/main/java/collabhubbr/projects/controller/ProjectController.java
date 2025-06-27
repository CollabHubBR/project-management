package collabhubbr.projects.controller;

import collabhubbr.projects.controller.DTO.RequestProjectDTO;
import collabhubbr.projects.controller.DTO.RequestTaskDTO;
import collabhubbr.projects.controller.DTO.ResponseProjectDTO;
import collabhubbr.projects.controller.DTO.ResponseTaskDTO;
import collabhubbr.projects.service.ProjectService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/project")
public interface ProjectController {

    @PostMapping("/create")
    ResponseEntity<ResponseProjectDTO> createRepoProject(@Valid @RequestBody RequestProjectDTO project);

    @PostMapping("/task/create")
    ResponseEntity<ResponseTaskDTO> createTask(@Valid @RequestBody RequestTaskDTO project);
}
