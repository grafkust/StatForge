package com.grafkust.crime_analyzer.entity.sub.crime;

import com.grafkust.crime_analyzer.entity.dictionary.code.CrmCodeDictionary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "crm_additional_codes")
@Getter
@Setter
public class CrmCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "set_id")
    private CrmCodeSet codeSet;

    @ManyToOne
    @JoinColumn(name = "code")
    private CrmCodeDictionary dictionary;

}
