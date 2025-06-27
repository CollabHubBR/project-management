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
    // private final ProjectMapper projectMapper; Resolver essa parada
    private final ProjectRepository projectRepository;

    @Override
    public ResponseProjectDTO createProject(RequestProjectDTO project) {
        Project preRes = new Project();
        preRes.setUserProject(project.userProject());
        preRes.setName(project.name());
        projectRepository.save(preRes);
        return new ResponseProjectDTO(preRes.getName(), project.userProject());
    }

}
