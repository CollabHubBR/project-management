package collabhubbr.projects.mappers;

import collabhubbr.projects.controller.DTO.RequestTaskDTO;
import collabhubbr.projects.controller.DTO.ResponseTaskDTO;
import collabhubbr.projects.model.Task;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    Task toEntity (RequestTaskDTO dto);

    ResponseTaskDTO toDTO (Task task);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Task partialUpdate(RequestTaskDTO dto, @MappingTarget Task task);

    List<ResponseTaskDTO> toDTOs (List<Task> list);
}
