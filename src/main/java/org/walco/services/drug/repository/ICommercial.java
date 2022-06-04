package org.walco.services.drug.repository;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;
import org.springframework.stereotype.Repository;
import org.walco.services.drug.model.entity.Commercial;

@Repository
public interface ICommercial extends RxJava3CrudRepository<Commercial, Long> {
}
