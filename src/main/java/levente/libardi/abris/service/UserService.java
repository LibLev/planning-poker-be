package levente.libardi.abris.service;

import levente.libardi.abris.model.AppUser;
import levente.libardi.abris.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Creat and save new user
    public void addNewUser(Map<String, String> data) {
        AppUser newAppUser = AppUser.builder()
                .name(data.get("name"))
                .build();
        userRepository.save(newAppUser);
    }
}
