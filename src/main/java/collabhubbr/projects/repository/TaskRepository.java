package collabhubbr.projects.repository;

import collabhubbr.projects.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
