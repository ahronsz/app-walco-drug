package org.walco.services.drug.repository;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;
import org.walco.services.drug.repository.entity.Disease;

public interface DiseaseRepository extends RxJava3CrudRepository<Disease, Long> {

}