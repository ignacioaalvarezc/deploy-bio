package com.sys.bio.back.services.item;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.cutting.CutBox;
import com.sys.bio.back.models.item.CleaningTool;
import com.sys.bio.back.repositories.item.CleaningToolRepository;
import com.sys.bio.back.utils.date.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class CleaningToolServiceImplements implements CleaningToolService{

    @Autowired
    private CleaningToolRepository toolRepo;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @Override
    public CleaningTool addCleaningTool(CleaningTool cleaningTool) {
        return toolRepo.save(cleaningTool);
    }

    @Override
    public CleaningTool updateCleaningTool(CleaningTool cleaningTool) {
        return toolRepo.save(cleaningTool);
    }

    @Override
    public Set<CleaningTool> getCleaningTools() {
        return new LinkedHashSet<>(toolRepo.findAll());
    }

    @Override
    public CleaningTool getCleaningTool(Long cleaningToolId) {
        return toolRepo.findById(cleaningToolId).get();
    }

    @Override
    public void deleteCleaningTool(Long cleaningToolId) {
        CleaningTool cleaningTool = new CleaningTool();
        cleaningTool.setCleaningToolId(cleaningToolId);
        toolRepo.delete(cleaningTool);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CleaningTool> findAll() {
        return (List<CleaningTool>) toolRepo.findAll();
    }

}
