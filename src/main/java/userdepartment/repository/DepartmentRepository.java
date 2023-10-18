package userdepartment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import userdepartment.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
