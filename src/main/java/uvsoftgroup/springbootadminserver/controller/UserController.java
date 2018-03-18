package uvsoftgroup.springbootadminserver.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uvsoftgroup.springbootadminserver.model.User;
import uvsoftgroup.springbootadminserver.service.UserService;

@RestController
@RequestMapping("/userResource")
public class UserController {
	
	@Autowired
    UserService userService;
	@GetMapping("/users")
	public List<User> findAllUser() {
	    return userService.findAll();
	}
	
	@PostMapping("/user")
	public User createUser(@Valid @RequestBody User user) {
	    return userService.save(user);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value="id") Long userId) {
	    return userService.findById(userId);
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable(value="id")Long userId, @Valid @RequestBody User userUpdate) {
	    return userService.update(userId, userUpdate);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable(value="id")Long userId) {
	    return userService.delete(userId);
	}
	
}
