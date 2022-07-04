package org.walco.services.drug.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "Drugs_diseases")
@Getter
@Setter
public class DrugDisease {

    @Id
    @Column
    private Long id;

    @Column(value = "drug_id")
    private Long drugId;

    @Column(value = "disease_id")
    private Long diseaseId;
}
