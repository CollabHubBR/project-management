package collabhubbr.projects.DTO;

import collabhubbr.projects.model.Members;

import java.util.List;

public record ResponseProjectDTO(
        String name,
        List<Members> members
) {
}
