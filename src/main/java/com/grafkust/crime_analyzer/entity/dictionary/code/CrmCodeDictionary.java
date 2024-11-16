package com.grafkust.crime_analyzer.entity.dictionary.code;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "crime_codes_dictionary")
@Getter @Setter
public class CrmCodeDictionary {

    @Id
    private Integer code;

    @Column(name = "desc")
    private String transcript;

}
