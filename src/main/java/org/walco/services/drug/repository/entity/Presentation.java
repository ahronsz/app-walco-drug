package org.walco.services.drug.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "Presentations")
@Getter
@Setter
public class Presentation {

    @Id
    @Column
    private Long id;

    @Column(value = "dealer_id")
    private Long dealerId;

    @Column(value = "drug_id")
    private Long drugId;

    @Column
    private String name;

    @Column
    private String weight;

    @Column
    private String symbol;
}
