package collabhubbr.projects.service.impl;

import collabhubbr.projects.controller.DTO.RequestProjectDTO;
import collabhubbr.projects.controller.DTO.RequestTaskDTO;
import collabhubbr.projects.controller.DTO.ResponseProjectDTO;
import collabhubbr.projects.controller.DTO.ResponseTaskDTO;
import collabhubbr.projects.model.Project;
import collabhubbr.projects.model.Task;
import collabhubbr.projects.repository.ProjectRepository;
import collabhubbr.projects.repository.TaskRepository;
import collabhubbr.projects.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    private final TaskRepository taskRepository;

    @Override
    public ResponseProjectDTO createProject(RequestProjectDTO project) {
        Project preRes = new Project();
        preRes.setName(project.name());
        preRes.setUserProject(project.userProject());
        projectRepository.save(preRes);
        return new ResponseProjectDTO(project.name(),  project.userProject());
    }

    @Override
    public ResponseTaskDTO create(RequestTaskDTO task) {
        Task preRes = new Task();
        preRes.setName(task.name());
        preRes.setProject(task.project());
        preRes.setDescription(task.description());
        preRes.setStatus(task.status());
        taskRepository.save(preRes);
        return new ResponseTaskDTO(task.name(), task.description(), task.status());
    }
}
