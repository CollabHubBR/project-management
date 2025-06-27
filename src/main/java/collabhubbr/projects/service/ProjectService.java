package collabhubbr.projects.service;

import collabhubbr.projects.controller.DTO.RequestProjectDTO;
import collabhubbr.projects.controller.DTO.ResponseProjectDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProjectService {
    ResponseProjectDTO createProject(@Valid @RequestBody RequestProjectDTO project);
}
