package com.sys.bio.back.repositories.cutting;

import com.sys.bio.back.models.cutting.CutBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CutBoxRepository extends JpaRepository<CutBox, Long>,
        JpaSpecificationExecutor<CutBox> {

    @Query("SELECT c.cutBoxId FROM CutBox c")
    List<Long> findAllIds();

    List<CutBox> findByDateBetween(Date startDate, Date endDate);

    List<CutBox> findByResponsibleNameContainingIgnoreCase(String name);

    List<CutBox> findByCutTypeNameContainingIgnoreCase(String name);

    @Query("SELECT SUM(c.amount) FROM CutBox c WHERE c.cutType.name = 'Mini'")
    Integer getTotalAmountForMiniCuts(Date currentDate);

    @Query("SELECT SUM(c.amount) FROM CutBox c WHERE c.cutType.name = 'Standard'")
    Integer getTotalAmountForStandardCuts();

    @Query("SELECT SUM(c.amount) FROM CutBox c WHERE c.cutType.name = 'Biggy'")
    Integer getTotalAmountForBiggyCuts();
}
