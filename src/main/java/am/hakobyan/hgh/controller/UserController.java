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

    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }
    @GetMapping("/by/{userName}")
    public User getUserByName(@PathVariable String userName) {
        return userService.userByName(userName);
    }

//    @PutMapping("/all")
//    public void addNewUser(@RequestBody UserDto userDto) {
//        return userService.addNewUser(userMapper.dtoToUser(userDto));
//
//    }
    @GetMapping("/zip/{zipCode}")
    public List<User> getUserZipCode(@PathVariable String zipCode) {
        return userService.getUserByZipCode(zipCode);
    }
    @GetMapping("/usertask")
    public List<User> getUserZipCode() {
        return userService.getUserByTask();
    }

}
