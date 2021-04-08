package ca.ontario.cyssc.demo;
import org.springframework.data.repository.*;
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
