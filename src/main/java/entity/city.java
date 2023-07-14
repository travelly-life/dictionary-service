package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Table(name = "city")
public class city {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "region_id")
    @GeneratedValue
    private BigInteger region_id;

    @Column(name = "name")
    private String name;

    @Column(name = "crt_date")
    private Timestamp crt_date;
}
