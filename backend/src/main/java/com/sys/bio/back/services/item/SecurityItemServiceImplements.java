package com.sys.bio.back.services.item;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.item.CleaningTool;
import com.sys.bio.back.models.item.SecurityItem;
import com.sys.bio.back.repositories.item.SecurityItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class SecurityItemServiceImplements implements SecurityItemService {

    @Autowired
    private SecurityItemRepository itemRepo;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @Override
    public SecurityItem addSecurityItem(SecurityItem securityItem) {
        return itemRepo.save(securityItem);
    }

    @Override
    public SecurityItem updateSecurityItem(SecurityItem securityItem) {
        return itemRepo.save(securityItem);
    }

    @Override
    public Set<SecurityItem> getSecurityItems() {
        return new LinkedHashSet<>(itemRepo.findAll());
    }

    @Override
    public SecurityItem getSecurityItem(Long securityItemId) {
        return itemRepo.findById(securityItemId).get();
    }

    @Override
    public void deleteSecurityItem(Long securityItemId) {
        SecurityItem securityItem = new SecurityItem();
        securityItem.setSecurityItemId(securityItemId);
        itemRepo.delete(securityItem);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SecurityItem> findAll() {
        return (List<SecurityItem>) itemRepo.findAll();
    }
}
