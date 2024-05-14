package com.sys.bio.back.services.cutting;

import com.sys.bio.back.models.cutting.Cutting;
import com.sys.bio.back.repositories.cutting.CuttingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CuttingServiceImpl implements CuttingService {

    @Autowired
    private CuttingRepository cuttingRepository;

    @Override
    public Cutting addCutting(Cutting cutting) {
        return cuttingRepository.save(cutting);
    }

    @Override
    public Cutting updateCutting(Cutting cutting) {
        return cuttingRepository.save(cutting);
    }

    @Override
    public Set<Cutting> getCuttings() {
        return new LinkedHashSet<>(cuttingRepository.findAll());
    }

    @Override
    public Cutting getCutting(Long cuttingId) {
        return cuttingRepository.findById(cuttingId).get();
    }

    @Override
    public void deleteCutting(Long cuttingId) {
        Cutting cutting = new Cutting();
        cutting.setCuttingId(cuttingId);
        cuttingRepository.delete(cutting);
    }

    @Override
    public List<Cutting> getCuttingsByDateRange(Date startDate, Date endDate) {
        return cuttingRepository.findByDateBetween(startDate, endDate);
    }

    @Override
    public List<Cutting> searchByResponsibleName(String name) {
        if (name != null) {
            return cuttingRepository.findByResponsibleNameContainingIgnoreCase(name);
        } else {
            return Collections.emptyList();
        }
    }



}
