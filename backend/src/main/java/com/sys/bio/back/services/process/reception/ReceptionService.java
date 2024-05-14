package com.sys.bio.back.services.process.reception;

import com.sys.bio.back.models.reception.Reception;
import com.sys.bio.back.models.user.Responsible;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ReceptionService {

    Reception addReception(Reception reception);
    Reception updateReception(Reception reception);
    Set<Reception> getReceptions();
    public List<Reception> findAll();
    Reception getReception(Long receptionId);
    void deleteReception(Long receptionId);
    List<Reception> getReceptionsByDateRange(Date startDate, Date endDate);

    List<Reception> searchByResponsibleName(String name);

    /*
    Map<String, Double> getTotalHoursByResponsibleForCurrentMonth();

     */
}
