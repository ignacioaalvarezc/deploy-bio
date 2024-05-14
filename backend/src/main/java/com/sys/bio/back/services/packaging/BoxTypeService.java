package com.sys.bio.back.services.packaging;



import com.sys.bio.back.models.packaging.BoxType;

import java.util.List;
import java.util.Set;

public interface BoxTypeService {

    BoxType addBoxType(BoxType boxType);
    BoxType updateBoxType(BoxType boxType);
    Set<BoxType> getBoxTypes();
    BoxType getBoxType(Long boxTypeId);
    void deleteBoxType(Long boxTypeId);
    void toggleBoxTypeStatus(Long boxTypeId, boolean newStatus);

    List<BoxType> findAll();
}
