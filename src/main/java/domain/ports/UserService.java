package domain.ports;

import domain.models.User;
import domain.models.device.Device;

import java.util.List;
import java.util.Optional;

public interface UserService {
    // rückgabetyp User aber nicht void?
    User createUser(User user);
    User updateUser(int id, User user);
    void deleteUser(int id);

    Optional<User> getUserById(int id);
    Optional<User> findByEmail(String email);
    List<Device> getDevicesOfUser(int id);

    List<User> getAllUsers();



}
