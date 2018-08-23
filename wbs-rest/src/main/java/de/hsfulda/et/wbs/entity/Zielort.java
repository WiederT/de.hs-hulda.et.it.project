package de.hsfulda.et.wbs.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ZIELORTE")
public class Zielort {

    @Id
    private BigInteger id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRAEGER_ID")
    private Traeger traeger;

    @ManyToMany(mappedBy = "zielort", fetch = FetchType.LAZY)
    private List<Bestand> bestaende;

    @ManyToMany(mappedBy = "zielort", fetch = FetchType.LAZY)
    private List<Kontakt> kontakte;

    protected Zielort() {}

}