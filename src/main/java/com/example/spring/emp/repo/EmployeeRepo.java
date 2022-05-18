package com.example.spring.emp.repo;

import com.example.spring.emp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    @Transactional
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
