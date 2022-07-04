package org.walco.services.drug.business;

import io.reactivex.rxjava3.core.Single;
import org.walco.services.drug.repository.entity.Disease;

public interface IDiseaseService {

    Single<Disease> save(Disease disease);
}
