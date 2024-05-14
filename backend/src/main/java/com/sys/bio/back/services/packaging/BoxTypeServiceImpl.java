package com.sys.bio.back.services.packaging;

import com.sys.bio.back.models.packaging.BoxType;
import com.sys.bio.back.repositories.packaging.BoxTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class BoxTypeServiceImpl implements BoxTypeService{


    @Autowired
    private BoxTypeRepository boxTypeRepo;

    @Override
    public BoxType addBoxType(BoxType boxType) {
        return boxTypeRepo.save(boxType);
    }

    @Override
    public BoxType updateBoxType(BoxType boxType) {
        return boxTypeRepo.save(boxType);
    }

    @Override
    public Set<BoxType> getBoxTypes() {
        return new LinkedHashSet<>(boxTypeRepo.findAll());
    }

    @Override
    public BoxType getBoxType(Long boxTypeId) {
        return boxTypeRepo.findById(boxTypeId).get();
    }

    @Override
    public void deleteBoxType(Long boxTypeId) {
        BoxType boxType = new BoxType();
        boxType.setBoxTypeId(boxTypeId);
        boxTypeRepo.delete(boxType);
    }

    @Override
    public void toggleBoxTypeStatus(Long boxTypeId, boolean newStatus) {
        BoxType boxType = boxTypeRepo.findById(boxTypeId).orElse(null);
        if (boxType != null) {
            boxType.setEnabled(newStatus);
            boxTypeRepo.save(boxType);
        }
    }

    @Override
    public List<BoxType> findAll() {
        return  boxTypeRepo.findAll();
    }
}
