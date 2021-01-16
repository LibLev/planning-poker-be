package levente.libardi.abris.repository;

import levente.libardi.abris.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
