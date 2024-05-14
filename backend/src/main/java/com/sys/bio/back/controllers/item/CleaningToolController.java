package com.sys.bio.back.controllers.item;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.item.CleaningTool;
import com.sys.bio.back.services.item.CleaningToolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cleaningTools")
@CrossOrigin("*")
public class CleaningToolController {

    @Autowired
    private CleaningToolService toolService;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);


    @PostMapping("/")
    public ResponseEntity<CleaningTool> saveCleaningTool(@RequestBody CleaningTool cleaningTool) {
        return ResponseEntity.ok(toolService.addCleaningTool(cleaningTool));
    }

    @PutMapping("/update/{cleaningToolId}")
    public ResponseEntity<CleaningTool> updateCleaningTool(@PathVariable("cleaningToolId") Long cleaningToolId,
                                               @Valid @RequestBody CleaningTool cleaningTool) {
        try {
            cleaningTool.setCleaningToolId(cleaningToolId);
            CleaningTool updatedCleaningTool = toolService.updateCleaningTool(cleaningTool);
            return ResponseEntity.ok(updatedCleaningTool);
        } catch (Exception e) {
            log.error("Error al actualizar la caja de corte con ID: " + cleaningToolId, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> listCleaningTools() {
        return ResponseEntity.ok(toolService.getCleaningTools());
    }

    @GetMapping("/id/{cleaningToolId}")
    public CleaningTool listCleaningTool(@PathVariable("cleaningToolId") Long cleaningToolId) {
        return toolService.getCleaningTool(cleaningToolId);
    }


    @DeleteMapping("/{cleaningToolId}")
    public void deleteCleaningTool(@PathVariable("cleaningToolId") Long cleaningToolId) {
        toolService.deleteCleaningTool(cleaningToolId);
    }
}
