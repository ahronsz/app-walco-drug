package org.walco.services.drug.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Presentation {

    @Id
    private Long id;

    private String name;

    private String weight;

    private String symbol;
}
