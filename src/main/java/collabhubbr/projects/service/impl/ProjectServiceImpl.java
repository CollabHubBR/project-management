package collabhubbr.projects.service.impl;

import collabhubbr.projects.controller.DTO.RequestProjectDTO;
import collabhubbr.projects.controller.DTO.ResponseProjectDTO;
import collabhubbr.projects.model.Project;
import collabhubbr.projects.repository.ProjectRepository;
import collabhubbr.projects.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    @Override
    public ResponseProjectDTO createProject(RequestProjectDTO project) {
        Project preRes = new Project();
        preRes.setName(project.name());
        preRes.setUserProject(project.userProject());
        projectRepository.save(preRes);
        return new ResponseProjectDTO(project.name(),  project.userProject());
    }
}
