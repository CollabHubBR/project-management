package collabhubbr.projects.service;

import collabhubbr.projects.controller.DTO.RequestTaskDTO;
import collabhubbr.projects.controller.DTO.ResponseTaskDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

public interface TaskService {
    ResponseTaskDTO create(@Valid @RequestBody RequestTaskDTO task);
}
