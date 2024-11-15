package infrastructure.adapters;

import infrastructure.persistence.entities.UserEntity;
import infrastructure.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity user){
        return userRepository.save(user);
    }

    public Optional<UserEntity> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public Optional<UserEntity> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
}
