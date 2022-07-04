package org.walco.services.expose.web;

import io.reactivex.rxjava3.core.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.walco.services.drug.business.IDiseaseService;
import org.walco.services.drug.repository.entity.Disease;

@RestController
@RequestMapping
public class DiseaseController {

    @Autowired
    private IDiseaseService diseaseService;

    @PostMapping
    public Single<Disease> save(Disease disease) {
        return diseaseService.save(disease);
    }

}
