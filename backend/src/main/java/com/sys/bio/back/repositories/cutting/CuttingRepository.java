package com.sys.bio.back.repositories.cutting;

import com.sys.bio.back.models.cutting.Cutting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CuttingRepository extends JpaRepository<Cutting, Long> {

    @Query("SELECT c.cuttingId FROM Cutting c")
    List<Long> findAllIds();

    List<Cutting> findByDateBetween(Date startDate, Date endDate);

    List<Cutting> findByResponsibleNameContainingIgnoreCase(String name);

}
