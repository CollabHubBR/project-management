package collabhubbr.projects.controller.DTO;

import collabhubbr.projects.model.UserProject;
import jakarta.validation.constraints.NotBlank;


public record RequestProjectDTO(
        @NotBlank
        String name,
        UserProject userProject
) {
}
