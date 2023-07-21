package com.travelly.dictionaryservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@Table(name = "region")
public class Region {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "name")
    private String name;
}
