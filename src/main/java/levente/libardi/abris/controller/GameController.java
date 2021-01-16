package levente.libardi.abris.controller;

import levente.libardi.abris.model.AppUser;
import levente.libardi.abris.model.Card;
import levente.libardi.abris.model.Task;
import levente.libardi.abris.service.CardService;
import levente.libardi.abris.service.TaskService;
import levente.libardi.abris.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@AllArgsConstructor
public class GameController {

    private UserService userService;
    private TaskService taskService;
    private CardService cardService;

    //Show all task
    @GetMapping("/get-all-task")
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

    @PostMapping("/add-value-to-task")
    public void addValueToTask(@RequestBody Map<String, String> data){
        AppUser user = userService.getUser((data.get("name")));
        Task task = taskService.getTask(Long.parseLong(data.get("taskId")));
        Card card = Card.builder()
                .task(task)
                .user(user)
                .numOfCard(Integer.parseInt(data.get("cardValue")))
                .build();
        cardService.saveCard(card);
    }

    @GetMapping("/get-result-by-task")
    public Map<String, Integer> getResult(@RequestBody Map<String, String> data){
        Long id = Long.parseLong(data.get("taskId"));
        Map<String, Integer> result = new HashMap<>();
        List<Card> allCardOfTask = cardService.getAllCardOfTask(id);
        int sum = 0;
        for (Card card: allCardOfTask) {
            result.put(card.getUser().getName(), card.getNumOfCard());
            sum += card.getNumOfCard();
        }
        int average = sum/allCardOfTask.size();
        result.put("AVERAGE",average);
        return result;
    }


}
