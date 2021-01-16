package levente.libardi.abris.controller;

import levente.libardi.abris.model.Task;
import levente.libardi.abris.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    private TaskService taskService;

    //Show all task
    @GetMapping("/get-all-task")
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }


}
