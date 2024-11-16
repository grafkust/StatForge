package com.grafkust.crime_analyzer.entity.sub.premise;

import com.grafkust.crime_analyzer.entity.dictionary.code.PremiseCodeDictionary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "premise_info")
@Getter @Setter
public class CrmPremise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "premise_code")
    private PremiseCodeDictionary code;

    @Column(name = "premise_desc")
    private String description;
}
