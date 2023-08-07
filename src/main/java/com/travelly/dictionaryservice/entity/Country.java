package com.travelly.dictionaryservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
