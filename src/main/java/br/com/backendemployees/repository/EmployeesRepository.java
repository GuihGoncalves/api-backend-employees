package br.com.backendemployees.repository;

import br.com.backendemployees.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    @Query(
            value = "SELECT emp" +
                    " FROM Employees emp"
    )
    public List<Employees> getEmply();
    @Query(
            value = "SELECT emp" +
                    " FROM Employees emp" +
                    " WHERE employeeId = :pEmployeeId"
    )
    public Employees getEmply(@Param("pEmployeeId") Long idd);
}
