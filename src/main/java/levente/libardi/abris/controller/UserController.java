package levente.libardi.abris.controller;

import levente.libardi.abris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    //User has to add his/her name to start add values for tasks
    @PostMapping("/add-name")
    public Map<String,String> addYourName(@RequestBody Map<String, String> data){
        return userService.addNewUser(data);
    }
}
