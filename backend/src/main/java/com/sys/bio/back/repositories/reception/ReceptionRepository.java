package com.sys.bio.back.repositories.reception;

import com.sys.bio.back.models.reception.Reception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ReceptionRepository extends JpaRepository<Reception, Long>,
        JpaSpecificationExecutor<Reception> {

    @Query("SELECT r.receptionId FROM Reception r")
    List<Long> findAllIds();

    List<Reception> findByDateBetween(Date startDate, Date endDate);
    
    List<Reception> findByResponsibleNameContainingIgnoreCase(String name);
}
