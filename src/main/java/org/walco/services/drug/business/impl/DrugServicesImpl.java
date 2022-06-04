package org.walco.services.drug.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.walco.services.drug.business.IDrugServices;
import org.walco.services.drug.repository.IDrugRepository;

@Service
public class DrugServicesImpl implements IDrugServices {

    @Autowired
    private IDrugRepository drugRepository;


}
