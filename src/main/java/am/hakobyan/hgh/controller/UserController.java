package am.hakobyan.hgh.controller;

import am.hakobyan.hgh.dto.UserDto;
import am.hakobyan.hgh.entity.User;
import am.hakobyan.hgh.mapper.UserMapper;
import am.hakobyan.hgh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/all")
    public void addNewUser(@RequestBody UserDto userDto) {
        userService.addNewUser(userMapper.dtoToUser(userDto));

    }

}
