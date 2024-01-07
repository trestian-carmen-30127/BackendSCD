package com.utcn.backend.v1.Employee;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer ID;
    private String name;
    private Integer departmentID;
    private Integer managerID;
    private String email;

}
