package vn.advtv.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import vn.advtv.ai.model.Users;
import vn.advtv.ai.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(produces = "application/json")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userRepository.deleteById(id);
    }

    @PostMapping
    public Users create(@RequestBody Users user) {
        return userRepository.save(user);
    }
}
