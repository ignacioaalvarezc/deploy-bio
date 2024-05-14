package com.sys.bio.back.services.sanitized;

import com.sys.bio.back.models.sanitized.SanitizedBox;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface SanitizedBoxService {

    SanitizedBox addSanitizedBox(SanitizedBox sanitizedBox);

    SanitizedBox updateSanitizedBox(SanitizedBox sanitizedBox);
    Set<SanitizedBox> getSanitizedBoxes();
    SanitizedBox getSanitizedBox(Long sanitizedBoxId);
    void deleteSanitizedBoxId(Long sanitizedBoxId);
    List<SanitizedBox> getSanitizedBoxesByDateRange(Date startDate, Date endDate);

    List<SanitizedBox> searchByResponsibleName(String name);

    List<SanitizedBox> getEnabledSanitizedBoxes();

    void saveAll(List<SanitizedBox> sanitizedBoxes);
}
