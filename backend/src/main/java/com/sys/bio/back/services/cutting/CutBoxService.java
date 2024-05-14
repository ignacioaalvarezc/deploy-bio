package com.sys.bio.back.services.cutting;

import com.sys.bio.back.models.cutting.CutBox;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface CutBoxService {

    CutBox addCutBox(CutBox cutBox);
    CutBox updateCutBox(CutBox cutBox);
    Set<CutBox> getCutBoxes();
    public List<CutBox> findAll();
    CutBox getCutBox(Long cutBoxId);
    void deleteCutBox(Long cutBoxId);
    List<CutBox> getCutBoxesByDateRange(Date startDate, Date endDate);

    List<CutBox> searchByResponsibleName(String name);
    List<CutBox> searchByCutTypeName(String name);


    void saveAll(List<CutBox> cutBoxes);

    Integer getTotalAmountForMiniCuts();

    Integer getTotalAmountForStandardCuts();
    Integer getTotalAmountForBiggyCuts();

    Integer getTotalAmountByCutType(String name);
}
