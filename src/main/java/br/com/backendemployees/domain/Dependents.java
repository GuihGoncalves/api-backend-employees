package br.com.backendemployees.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Data
@NoArgsConstructor
@Table(name="DEPENDENTS"/*,schema = "integration"*/)
public class Dependents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dependent_id")
    private Long dependentId;
    @Column(name = "dependent_First_Name")
    private String dependentFirstName;
    @Column(name = "dependent_Last_Name")
    private String dependentLastName;
    @Column(name = "dependent_Birth_Date")
    private String dependentBirthDate;
}
