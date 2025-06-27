package collabhubbr.projects.service.impl;

import collabhubbr.projects.controller.DTO.RequestProjectDTO;
import collabhubbr.projects.controller.DTO.ResponseProjectDTO;
import collabhubbr.projects.mappers.ProjectMapper;
import collabhubbr.projects.model.Project;
import collabhubbr.projects.repository.ProjectRepository;
import collabhubbr.projects.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectMapper projectMapper;
    private final ProjectRepository projectRepository;

    @Override
    public ResponseProjectDTO createProject(RequestProjectDTO project) {
        Project preRes = projectMapper.toEntity(project);
        projectRepository.save(preRes);
        return projectMapper.toDTO(preRes);
    }

}
