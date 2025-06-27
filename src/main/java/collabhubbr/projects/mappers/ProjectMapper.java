package collabhubbr.projects.mappers;

import collabhubbr.projects.controller.DTO.RequestProjectDTO;
import collabhubbr.projects.controller.DTO.ResponseProjectDTO;
import collabhubbr.projects.model.Project;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    Project toEntity(RequestProjectDTO dto);
    ResponseProjectDTO toDTO(Project project);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Project partialUpdate(RequestProjectDTO dto, @MappingTarget Project project);

    List<ResponseProjectDTO> toDTOs (List<Project> list);
}

