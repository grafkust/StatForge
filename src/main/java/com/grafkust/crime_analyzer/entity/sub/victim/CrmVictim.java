package com.grafkust.crime_analyzer.entity.sub.victim;

import com.grafkust.crime_analyzer.entity.dictionary.descent.VictimDescentDictionary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "victim_info")
@Getter
@Setter
public class CrmVictim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vict_age")
    private Integer age;

    @Column(name = "vict_sex")
    private Sex sex;

    @ManyToOne
    @JoinColumn(name = "vict_desc")
    private VictimDescentDictionary descent;
}
