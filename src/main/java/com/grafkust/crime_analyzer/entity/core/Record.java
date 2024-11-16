package com.grafkust.crime_analyzer.entity.core;

import com.grafkust.crime_analyzer.entity.sub.crime.CrmCodeSet;
import com.grafkust.crime_analyzer.entity.sub.method.CrmMethod;
import com.grafkust.crime_analyzer.entity.sub.premise.CrmPremise;
import com.grafkust.crime_analyzer.entity.sub.victim.CrmVictim;
import com.grafkust.crime_analyzer.entity.sub.weapon.CrmWeapon;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "records")
@Getter @Setter
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "crm_date")
    private LocalDate crmDate;

    @Column(name = "crm_time")
    private LocalTime crmTime;

    @Column(name = "crm_desc")
    private String crmDesc;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE},orphanRemoval = true, fetch = FetchType.LAZY)
    private CrmCodeSet crmCodes;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true, fetch = FetchType.LAZY)
    private CrmMethod crmMethod;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true, fetch = FetchType.LAZY)
    private CrmPremise crmPremise;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true, fetch = FetchType.LAZY)
    private CrmVictim crmVictim;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true, fetch = FetchType.LAZY)
    private CrmWeapon crmWeapon;

}
