package com.sys.bio.back.services.sanitized;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.sanitized.SanitizedBox;
import com.sys.bio.back.repositories.sanitized.SanitizedBoxRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SanitizedBoxServiceImpl implements SanitizedBoxService {

    private final SanitizedBoxRepository boxRepo;

    @Autowired
    public SanitizedBoxServiceImpl(SanitizedBoxRepository boxRepo) {
        this.boxRepo = boxRepo;
    }

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @Override
    public SanitizedBox addSanitizedBox(SanitizedBox sanitizedBox) {
        return boxRepo.save(sanitizedBox);
    }


    @Override
    public SanitizedBox updateSanitizedBox(SanitizedBox sanitizedBox) {
        return boxRepo.save(sanitizedBox);
    }

    @Override
    public Set<SanitizedBox> getSanitizedBoxes() {
        return new LinkedHashSet<>(boxRepo.findAll());
    }

    @Override
    public SanitizedBox getSanitizedBox(Long sanitizedBoxId) {
        return boxRepo.findById(sanitizedBoxId).get();
    }

    @Override
    public void deleteSanitizedBoxId(Long sanitizedBoxId) {
        SanitizedBox sanitizedBox = new SanitizedBox();
        sanitizedBox.setSanitizedBoxId(sanitizedBoxId);
        boxRepo.delete(sanitizedBox);
    }


    @Override
    public List<SanitizedBox> searchByResponsibleName(String name) {
        if (name != null) {
            return boxRepo.findByResponsibleNameContainingIgnoreCase(name);
        } else {
            return Collections.emptyList();
        }
    }


    public List<SanitizedBox> getSanitizedBoxesByDateRange(Date startDate, Date endDate) {
        return boxRepo.findByDateBetween(startDate, endDate);
    }

    @Override
    public List<SanitizedBox> getEnabledSanitizedBoxes() {
        return boxRepo.findByState(false);
    }

    @Override
    public void saveAll(List<SanitizedBox> sanitizedBoxes) {
        boxRepo.saveAll(sanitizedBoxes);
    }
}
