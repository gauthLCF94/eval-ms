package eval.ms.maven.evalmsback.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eval.ms.maven.evalmsback.Models.UserModel;
import eval.ms.maven.evalmsback.repositories.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/user/{id}")
	public Optional<UserModel> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping(value = "/users")
	public List<UserModel> getUsers() {
		System.out.println("trace getUsers");
		List<UserModel> users = new ArrayList<UserModel>(); 
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	@PostMapping(value = "/addUser") 
	public void addUser(@RequestBody UserModel u) {
		userRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateUser(@RequestBody UserModel u) {
		userRepository.save(u);
	}
	
	@DeleteMapping(value = "/deleteUser")
	public void deleteUser(@RequestBody UserModel u) {
		userRepository.delete(u);
	}	
	
	
	@PostMapping(value = "/login")
	public Optional<UserModel> login(@RequestBody UserModel u) {
		return userRepository.findByEmailAndPassword(u.getEmail(), u.getPassword());
	}
 	
}
