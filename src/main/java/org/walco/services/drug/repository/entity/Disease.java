package org.walco.services.drug.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "Diseases")
@Getter
@Setter
public class Disease {

    @Id
    @Column
    private Long id;

    @Column
    private String name;
}
