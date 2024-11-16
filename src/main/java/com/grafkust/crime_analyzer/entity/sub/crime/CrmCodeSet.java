package com.grafkust.crime_analyzer.entity.sub.crime;

import com.grafkust.crime_analyzer.entity.dictionary.code.CrmCodeDictionary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "crm_codes")
@Getter
@Setter
public class CrmCodeSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "crm_primary_code")
    private CrmCodeDictionary code;

    @OneToMany(mappedBy = "crmCodeSet", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CrmCode> additionalCodes = new ArrayList<>();

}
