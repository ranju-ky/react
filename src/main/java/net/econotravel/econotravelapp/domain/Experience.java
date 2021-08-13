package net.econotravel.econotravelapp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "experiences")
public class Experience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal pricePerPerson;

    public Experience(String name, BigDecimal pricePerPerson) {
        this.name = name;
        this.pricePerPerson = pricePerPerson;
    }

    public Experience() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(BigDecimal pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }
}
