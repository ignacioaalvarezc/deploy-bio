package com.sys.bio.back.services.item;

import com.sys.bio.back.models.item.CleaningTool;
import com.sys.bio.back.models.item.SecurityItem;

import java.util.List;
import java.util.Set;

public interface SecurityItemService {

    SecurityItem addSecurityItem(SecurityItem securityItem);

    SecurityItem updateSecurityItem(SecurityItem securityItem);

    Set<SecurityItem> getSecurityItems();

    public List<SecurityItem> findAll();

    SecurityItem getSecurityItem(Long securityItemId);

    void deleteSecurityItem(Long securityItemId);
}
