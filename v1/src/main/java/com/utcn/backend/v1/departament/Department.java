package com.utcn.backend.v1.departament;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmanetID;

    private  String description;
    private Integer parentID;
    private Integer managerID;
}
