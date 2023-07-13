package entity;

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
public class country {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @Column(name = "crt_date")
    private Timestamp crt_date;
}
