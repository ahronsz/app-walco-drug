package org.walco.services.drug.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commercial {

    @Id
    private Long id;

    private String name;
}
