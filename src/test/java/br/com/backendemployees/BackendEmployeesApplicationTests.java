//package br.com.backendemployees;
//
//import br.com.backendemployees.domain.Dependents;
//import br.com.backendemployees.domain.Employees;
//import br.com.backendemployees.repository.EmployeesRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootTest
//class BackendEmployeesApplicationTests {
//
////	@Test
////	void contextLoads() {
////	}
//
//	private final EmployeesRepository employeesRepositoryTest;
//
//	@Autowired
//	public BackendEmployeesApplicationTests(EmployeesRepository employeesRepositoryTest){
//		this.employeesRepositoryTest = employeesRepositoryTest;
//	}
//
//
//	@Test
//	public void cadastraFuncionario(){
//
//
//		Employees employees = new Employees();
//		employees.setEmployeeFirstName("guilherme");
//		employees.setEmployeeLastName("goncalves");
//		employees.setEmail("gncaguih@gmail.com");
//		employees.setEmployeeBirthDate("16/03/2000");
//		employees.setHireDate("02/02/2021");
//		employees.setShutdownDate("06/06/2022");
//
//		List<Dependents> listDependents=new ArrayList<>();
//
//		Dependents dependent1= new Dependents();
//		dependent1.setDependentFirstName("gabriel");
//		dependent1.setDependentLastName("nascimento");
//		dependent1.setDependentBirthDate("15/07/2001");
//
//		Dependents dependent2 = new Dependents();
//		dependent2.setDependentFirstName("Luan");
//		dependent2.setDependentLastName("Magalhaes");
//		dependent2.setDependentBirthDate("04/10/2001");
//
//		listDependents.add(dependent1);
//		listDependents.add(dependent2);
//
//		employees.setDependents(listDependents);
//		employeesRepositoryTest.save(employees);
//
//		System.out.println("teste executado"+employees);
//	}
//
//
//
//}
