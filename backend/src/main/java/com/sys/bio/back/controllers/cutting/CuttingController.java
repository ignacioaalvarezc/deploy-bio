package com.sys.bio.back.controllers.cutting;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.cutting.Cutting;
import com.sys.bio.back.models.dto.ResponsibleHoursSumDTO;
import com.sys.bio.back.services.cutting.CuttingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cuttings")
@CrossOrigin("*")
public class CuttingController {

    @Autowired
    private CuttingService cuttingService;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @PostMapping("/")
    public ResponseEntity<Cutting> saveCutting(@RequestBody Cutting cutting) {
        return ResponseEntity.ok(cuttingService.addCutting(cutting));
    }

    @PutMapping("/update/{cuttingId}")
    public ResponseEntity<Cutting> updateCutting(@PathVariable("cuttingId") Long cuttingId,
                                                 @Valid @RequestBody Cutting cutting) {
        try {
            cutting.setCuttingId(cuttingId);
            Cutting updatedCutting = cuttingService.updateCutting(cutting);
            return ResponseEntity.ok(updatedCutting);
        } catch (Exception e) {
            log.error("Error al actualizar el proceso de corte con ID: " + cuttingId, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> getCuttings() {
        return ResponseEntity.ok(cuttingService.getCuttings());
    }

    @GetMapping("/id/{cuttingId}")
    public Cutting getCutting(@PathVariable("cuttingId") Long cuttingId) {
        return cuttingService.getCutting(cuttingId);
    }

    @DeleteMapping("/{cuttingId}")
    public void deleteCutting(@PathVariable("cuttingId") Long cuttingId) {
        cuttingService.deleteCutting(cuttingId);
    }

    @GetMapping("/date-filter")
    public ResponseEntity<List<Cutting>> getFilteredCuttings(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        List<Cutting> filteredCuttings = cuttingService.getCuttingsByDateRange(startDate, endDate);
        return new ResponseEntity<>(filteredCuttings, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Cutting>> searchByResponsibleName(
            @RequestParam(value = "name", required = false) String name) {
        List<Cutting> cuttings = cuttingService.searchByResponsibleName(name);
        return new ResponseEntity<>(cuttings, HttpStatus.OK);
    }


}
