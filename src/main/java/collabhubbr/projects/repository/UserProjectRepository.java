package collabhubbr.projects.repository;

import collabhubbr.projects.model.UserProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProjectRepository extends JpaRepository<UserProject, Long> {
}
