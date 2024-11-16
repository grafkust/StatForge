package com.grafkust.crime_analyzer.entity.sub.method;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "method_info")
@Getter
@Setter
public class CrmMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "crmMethod", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MethodCode> methodCodes = new HashSet<>();

    @Column(name = "mo_desc")
    private String description;

}
