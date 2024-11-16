package com.grafkust.crime_analyzer.entity.dictionary.descent;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "victim_descents_dictionary")
@Getter
@Setter
public class VictimDescentDictionary {

    @Id
    private String descent;

    @Column(name = "desc")
    private String transcript;
}
