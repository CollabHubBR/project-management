package collabhubbr.projects.controller.impl;

import collabhubbr.projects.controller.DTO.RequestTaskDTO;
import collabhubbr.projects.controller.DTO.ResponseTaskDTO;
import collabhubbr.projects.controller.TaskController;
import collabhubbr.projects.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaskControllerImpl implements TaskController {
    private final TaskService taskService;

    @Override
    public ResponseEntity<ResponseTaskDTO> createTask(RequestTaskDTO task) {
        return ResponseEntity.ok().body(
                taskService.create(task)
        );
    }
}
