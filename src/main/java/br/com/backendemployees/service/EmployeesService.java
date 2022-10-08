package br.com.backendemployees.service;

import br.com.backendemployees.domain.Employees;
import br.com.backendemployees.exception.BadRequestException;
import br.com.backendemployees.repository.EmployeesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeesService {
    public EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository){
        this.employeesRepository=employeesRepository;
    }

    public List<Employees> getEmply(){
        return employeesRepository.getEmply();
    }

    public Employees getEmply(Long id){
        return employeesRepository.getEmply(id);
    }

    public Object save(Employees employees) {
        Employees newEmployees = new Employees();
        newEmployees.setEmployeeFirstName(employees.getEmployeeFirstName());
        newEmployees.setEmployeeLastName(employees.getEmployeeLastName());
        newEmployees.setEmail(employees.getEmail());
        newEmployees.setEmployeeBirthDate(employees.getEmployeeBirthDate());
        newEmployees.setShutdownDate(employees.getShutdownDate());
        newEmployees.setDependents(employees.getDependents());
        employeesRepository.save(employees);
        return employees;

    }

    public void deleteById(Long id){
        employeesRepository.delete(getEmply(id));
    }
//
    public Employees replace(Employees employees, Long id) {
        Employees saveEmply=employeesRepository.getEmply(id);
        Long saveEmployeeId = saveEmply.getEmployeeId();
        Employees newEmployees=new Employees();
        newEmployees.setEmployeeId(saveEmployeeId);
        newEmployees.setEmployeeFirstName(employees.getEmployeeFirstName());
        newEmployees.setEmployeeLastName(employees.getEmployeeLastName());
        newEmployees.setEmail(employees.getEmail());
        newEmployees.setHireDate(employees.getHireDate());
        newEmployees.setEmployeeBirthDate(employees.getEmployeeBirthDate());
        newEmployees.setShutdownDate(employees.getShutdownDate());
        newEmployees.setDependents(employees.getDependents());
        return employeesRepository.save(newEmployees);
    }
}