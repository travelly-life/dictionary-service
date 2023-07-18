package com.travelly.dictionaryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Table(name = "country")
public class Country {

    //автоинкремент
    @Id
    @Column(name = "id_auto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuto;

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
