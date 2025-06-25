package collabhubbr.projects.service;

import collabhubbr.projects.DTO.RequestProjectDTO;
import collabhubbr.projects.DTO.ResponseProjectDTO;
import collabhubbr.projects.model.Project;
import collabhubbr.projects.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ProjectService {
    private ProjectRepository projectRepository;

    public ResponseProjectDTO createProject(RequestProjectDTO project) {
        Project preRes = new Project();
        preRes.setName(project.name());
        preRes.setMembersInfos(project.members());
        projectRepository.save(preRes);
        return new ResponseProjectDTO(project.name(),  project.members());
    }

}
