package br.com.backendemployees.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name="EMPLOYEES"/*,schema = "integration"*/)
public class Employees {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "employee_id")
    private Long employeeId;
//    @NotEmpty(message = "The employee need a name")
    @Column(name = "employee_First_Name")
    private String employeeFirstName;
    @Column(name = "employee_Last_Name")
    private String employeeLastName;
    @Column(name = "email")
    private String email;
    @Column(name = "employee_Birth_Date")
    private String employeeBirthDate;
    @Column(name = "hire_date")
    private String hireDate;
    @Column(name = "shutdown_Date")
    private String shutdownDate;
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="employee_id", referencedColumnName="employee_id")
    private List<Dependents> dependents;
}
