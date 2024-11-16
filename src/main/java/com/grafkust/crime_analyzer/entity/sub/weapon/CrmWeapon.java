package com.grafkust.crime_analyzer.entity.sub.weapon;

import com.grafkust.crime_analyzer.entity.dictionary.code.WeaponCodeDictionary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "weapon_info")
@Getter @Setter
public class CrmWeapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "weapon_code")
    private WeaponCodeDictionary code;

    @Column(name = "weapon_desc")
    private String description;
}
