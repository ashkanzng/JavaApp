package am.hakobyan.hgh.controller;

import am.hakobyan.hgh.entity.Task;
import am.hakobyan.hgh.entity.User;
import am.hakobyan.hgh.mapper.TaskMapper;
import am.hakobyan.hgh.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskMapper taskMapper;


    @GetMapping(value = "/alltasks")
    public List<Task> getAllTasks() {

        return taskService.getTasks();
    }
    @GetMapping("/{taskId}")
    public List<User> getTaskById(@PathVariable Long taskId){

        return taskService.getTaskById(taskId);
    }

}
