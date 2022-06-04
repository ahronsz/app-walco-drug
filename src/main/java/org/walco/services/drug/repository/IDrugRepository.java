package org.walco.services.drug.repository;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;
import org.springframework.stereotype.Repository;
import org.walco.services.drug.model.entity.Drug;

@Repository
public interface IDrugRepository extends RxJava3CrudRepository<Drug, Long> {
}
