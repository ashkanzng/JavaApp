package am.hakobyan.hgh.service;


import am.hakobyan.hgh.entity.Task;
import am.hakobyan.hgh.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public List<Task> getTasks() {
        return (List<Task>) taskRepository.findAll();
    }
}
