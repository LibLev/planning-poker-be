package levente.libardi.abris.service;

import levente.libardi.abris.model.AppUser;
import levente.libardi.abris.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Creat and save new user
    public Map<String, String> addNewUser(Map<String, String> data) {
        AppUser newAppUser = AppUser.builder()
                .name(data.get("name"))
                .build();
        userRepository.save(newAppUser);
        Map<String, String> responseEntity = new HashMap<>();
        responseEntity.put("name", data.get("name"));
        responseEntity.put("success","The login was successfully");
        return responseEntity;
    }

    //Get user from DB
    public AppUser getUser(String name) {
        Optional<AppUser> optUser = userRepository.findByName(name);
        return optUser.get();
    }
}
