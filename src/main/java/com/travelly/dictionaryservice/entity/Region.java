package com.travelly.dictionaryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Timestamp;

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
    private Long country_id;

    @Column(name = "name")
    private String name;

}
