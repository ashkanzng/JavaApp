package am.hakobyan.hgh.controller;

import am.hakobyan.hgh.entity.Task;
import am.hakobyan.hgh.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping(value = "/alltasks")
    public List<Task> getAllTasks() {

        return taskService.getTasks();
    }

}
