package com.travelly.dictionaryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Table(name = "region")
public class Region {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "name")
    private String name;

}
