package am.hakobyan.hgh.service;


import am.hakobyan.hgh.entity.Task;
import am.hakobyan.hgh.entity.User;
import am.hakobyan.hgh.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return (List<Task>) taskRepository.findAll();
    }
    public List<User> getTaskById(Long taskId) {
        Optional<Task> task = taskRepository.findById(taskId);
        List<User> user = new ArrayList<>();
        task.ifPresent(t -> user.add(t.getUser()));
        return user;
    }
}
