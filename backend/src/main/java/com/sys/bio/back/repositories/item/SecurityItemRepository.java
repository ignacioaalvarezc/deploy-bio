package com.sys.bio.back.repositories.item;

import com.sys.bio.back.models.item.SecurityItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityItemRepository extends JpaRepository<SecurityItem, Long> {
}
