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
@Table(name = "country")
public class Country {

    @Id
//    Это автоинкрементируемый id
    @Column(name = "id_auto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_auto;

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
