package collabhubbr.projects.controller.DTO;

import collabhubbr.projects.model.Project;
import jakarta.validation.constraints.NotBlank;

public record RequestTaskDTO(
        Project project,
        @NotBlank
        String name,
        @NotBlank
        String description,
        @NotBlank
        String status
) {
}
