package br.com.backendemployees.controller;

import br.com.backendemployees.domain.Employees;
import br.com.backendemployees.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
    @RequestMapping("/api/employees")
@Log4j2
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class EmployeesController {
    private final EmployeesService employeesService;

    //GET e GET by Id
    @RequestMapping(method = RequestMethod.GET, path = "/getAllEmply",produces = "application/json")
    public List<Employees> getEmply(){
        return employeesService.getEmply();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getEmply",produces = "application/json")
    public Employees getEmply(@RequestParam(required = false) Long id){
        return employeesService.getEmply(id);
    }

    //POST
    @RequestMapping(method = RequestMethod.POST, path = "/insert",consumes ="application/json", produces = "application/json")
    public ResponseEntity<Object> save(@RequestBody Employees employees){
        return new ResponseEntity<>(employeesService.save(employees), HttpStatus.CREATED);
    }

    //PUT
    @RequestMapping(method = RequestMethod.PUT, path = "/update",consumes ="application/json", produces = "application/json")
    public Employees replace(@RequestParam(required = false) Long id, @RequestBody Employees employees){
        return employeesService.replace(employees, id);
    }
    //  DELETE
    @DeleteMapping(path = "/delete")
    public void deleteById(@RequestParam(required = false) Long id){
        employeesService.deleteById(id);
    }
}
