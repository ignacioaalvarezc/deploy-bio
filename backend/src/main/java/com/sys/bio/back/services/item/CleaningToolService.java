package com.sys.bio.back.services.item;


import com.sys.bio.back.models.item.CleaningTool;

import java.util.List;
import java.util.Set;

public interface CleaningToolService {

    CleaningTool addCleaningTool(CleaningTool cleaningTool);

    CleaningTool updateCleaningTool(CleaningTool cleaningTool);

    Set<CleaningTool> getCleaningTools();

    public List<CleaningTool> findAll();

    CleaningTool getCleaningTool(Long cleaningToolId);

    void deleteCleaningTool(Long cleaningToolId);

}
