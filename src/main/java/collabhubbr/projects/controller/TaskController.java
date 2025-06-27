package collabhubbr.projects.controller;

import collabhubbr.projects.controller.DTO.RequestTaskDTO;
import collabhubbr.projects.controller.DTO.ResponseTaskDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/project")
public interface TaskController {
    @PostMapping("/task/create")
    ResponseEntity<ResponseTaskDTO> createTask(@Valid @RequestBody RequestTaskDTO project);
}
