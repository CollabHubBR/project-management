package collabhubbr.projects.DTO;

import collabhubbr.projects.model.Members;

import java.util.List;

public record RequestProjectDTO(
        String name,
        List<Members> members
) {
}
