package collabhubbr.projects.controller.DTO;

import collabhubbr.projects.model.UserProject;

import java.util.List;

public record ResponseProjectDTO(
        String name,
        UserProject members
) {
}
