package org.walco.services.drug.business.impl;

import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.walco.services.drug.business.IDealerService;
import org.walco.services.drug.business.IDiseaseService;
import org.walco.services.drug.repository.entity.Disease;
import org.walco.services.drug.repository.DiseaseRepository;

@Service
public class DiseaseServiceImpl implements IDiseaseService {

    @Autowired
    private IDealerService iDealerService;

    @Autowired
    private DiseaseRepository diseaseRepository;

    @Override
    public Single<Disease> save(Disease disease) {
        return null;
        //return diseaseRepository.save(disease);
    }
}
