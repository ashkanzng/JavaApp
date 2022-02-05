package am.hakobyan.hgh.controller;

import am.hakobyan.hgh.entity.User;
import am.hakobyan.hgh.mapper.UserMapper;
import am.hakobyan.hgh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.allUsers();
    }

    @GetMapping("/{user_id}")
    public Optional<User> getUserById(@PathVariable Long user_id) {
        return userService.getUserById(user_id);
    }
    @GetMapping("/by/{userName}")
    public User getUserByName(@PathVariable String userName) {
        return userService.UserByName(userName);
    }


}
