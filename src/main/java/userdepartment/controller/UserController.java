package userdepartment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import userdepartment.model.Department;
import userdepartment.model.User;
import userdepartment.repository.DepartmentRepository;
import userdepartment.repository.UserRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @GetMapping("/dept/{id}")
    public List<User> findByDepartment(@PathVariable Long id) {
        return userRepository.findByDepartmentId(id);
    }

    @PostMapping()
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{idUser}/{idDept}")
    public User updateDept(@PathVariable Long idUser, Long idDept) {
        User userToUpdate = userRepository.findById(idUser).orElseThrow(NoSuchElementException::new);
        Department dept = departmentRepository.findById(idDept).orElseThrow(NoSuchElementException::new);
        userToUpdate.setDepartment(dept);
        return userRepository.save(userToUpdate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
