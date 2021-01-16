package levente.libardi.abris.service;

import levente.libardi.abris.model.Task;
import levente.libardi.abris.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    //Get all task from DB
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    //Get task from DB
    public Task getTask(Long taskId) {
        Optional<Task> optTask = taskRepository.findById(taskId);
        return optTask.get();
    }
}
