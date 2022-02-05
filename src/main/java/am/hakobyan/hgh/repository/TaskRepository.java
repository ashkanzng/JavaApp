package am.hakobyan.hgh.repository;

import am.hakobyan.hgh.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
