package com.sys.bio.back.services.process.reception;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.reception.Reception;
import com.sys.bio.back.models.user.Responsible;
import com.sys.bio.back.repositories.reception.ReceptionRepository;
import com.sys.bio.back.repositories.user.ResponsibleRepository;
import com.sys.bio.back.utils.date.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.*;

@Service
public class ReceptionServiceImpl implements ReceptionService {

    @Autowired
    private ReceptionRepository receptionRepository;

    @Autowired
    private ResponsibleRepository responsibleRepository;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);
    @Override
    public Reception addReception(Reception reception) {
        Date date = reception.getDate();
        LocalDate localDate = DateUtils.convertToLocalDate(date);
        reception.setFilterDate(localDate);
        return receptionRepository.save(reception);
    }
    @Override
    public Reception updateReception(Reception reception) {
        Date date = reception.getDate();
        LocalDate localDate = DateUtils.convertToLocalDate(date);
        reception.setFilterDate(localDate);
        return receptionRepository.save(reception);
    }

    @Override
    public Set<Reception> getReceptions() {
        return new LinkedHashSet<>(receptionRepository.findAll());
    }

    @Override
    public Reception getReception(Long receptionId) {
        return receptionRepository.findById(receptionId).get();
    }

    @Override
    public void deleteReception(Long receptionId) {
        Reception reception = new Reception();
        reception.setReceptionId(receptionId);
        receptionRepository.delete(reception);
    }


    @Override
    public List<Reception> searchByResponsibleName(String name) {
        if (name != null) {
            return receptionRepository.findByResponsibleNameContainingIgnoreCase(name);
        } else {
            return Collections.emptyList();
        }
    }


    public List<Reception> getReceptionsByDateRange(Date startDate, Date endDate) {
        return receptionRepository.findByDateBetween(startDate, endDate);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reception> findAll() {
        return (List<Reception>) receptionRepository.findAll();
    }

    /*
    @Override
    public Map<String, Double> getTotalHoursByResponsibleForCurrentMonth() {
        List<Reception> receptions = receptionRepository.findAll();
        Map<String, Double> totalHoursByResponsible = new HashMap<>();

        for (Reception reception : receptions) {
            Responsible responsible = reception.getResponsible();
            Double totalHours = reception.getTotalHours();
            totalHoursByResponsible.merge(responsible.getName(), totalHours, Double::sum);
        }
        return totalHoursByResponsible;
    }
     */
}
