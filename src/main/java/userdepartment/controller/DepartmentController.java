package userdepartment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import userdepartment.model.Department;
import userdepartment.repository.DepartmentRepository;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @PostMapping()
    public Department save(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        departmentRepository.deleteById(id);
    }
}
