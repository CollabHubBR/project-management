package collabhubbr.projects.service.impl;

import collabhubbr.projects.controller.DTO.RequestTaskDTO;
import collabhubbr.projects.controller.DTO.ResponseTaskDTO;
import collabhubbr.projects.mappers.TaskMapper;
import collabhubbr.projects.model.Task;
import collabhubbr.projects.repository.TaskRepository;
import collabhubbr.projects.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskMapper taskMapper;
    private final TaskRepository taskRepository;

    @Override
    public ResponseTaskDTO create(RequestTaskDTO task) {
        Task preRes = taskMapper.toEntity(task);
        taskRepository.save(preRes);
        return taskMapper.toDTO(preRes);
    }
}
