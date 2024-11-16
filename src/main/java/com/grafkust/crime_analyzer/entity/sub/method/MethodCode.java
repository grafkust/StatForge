package com.grafkust.crime_analyzer.entity.sub.method;

import com.grafkust.crime_analyzer.entity.dictionary.code.MethodCodeDictionary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "method_codes")
@Getter
@Setter
public class MethodCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "method_id")
    private CrmMethod crmMethod;

    @ManyToOne
    @JoinColumn(name = "code")
    private MethodCodeDictionary dictionary;
}
