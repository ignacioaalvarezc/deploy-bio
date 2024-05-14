package com.sys.bio.back.controllers.packaging;

import com.sys.bio.back.models.packaging.BoxType;
import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.services.packaging.BoxTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/boxTypes")
@CrossOrigin("*")
public class BoxTypeController {

    @Autowired
    private BoxTypeService boxTypeService;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);


    @PostMapping("/")
    public ResponseEntity<BoxType> saveBoxType(@RequestBody BoxType boxType) {
        BoxType savedBoxType = boxTypeService.addBoxType(boxType);
        return ResponseEntity.ok(savedBoxType);
    }

    @GetMapping("/id/{boxTypeId}")
    @RequestMapping(method = RequestMethod.GET, path = "/id/{boxTypeId}")
    public BoxType listBoxTypeById(@PathVariable("boxTypeId") Long boxTypeId) {
        return boxTypeService.getBoxType(boxTypeId);
    }

    @GetMapping("/")
    public ResponseEntity<?> boxTypeList() {
        return ResponseEntity.ok(boxTypeService.getBoxTypes());
    }

    @PutMapping("/update/{boxTypeId}")
    public ResponseEntity<BoxType> updateBoxType(@PathVariable("boxTypeId") Long boxTypeId,
                                                     @Valid @RequestBody BoxType boxType) {
        try {
            boxType.setBoxTypeId(boxTypeId);
            BoxType updatedBoxType = boxTypeService.updateBoxType(boxType);
            return ResponseEntity.ok(updatedBoxType);
        } catch (Exception e){
            log.error("Error al actualizar el tipo de caja con ID: " + boxTypeId, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{boxTypeId}")
    public void deleteBoxType(@PathVariable("boxTypeId") Long boxTypeId) {
        boxTypeService.deleteBoxType(boxTypeId);
    }

    @PutMapping("/toggle-status/{boxTypeId}")
    public ResponseEntity<String> toggleStrawTypeStatus(@PathVariable("boxTypeId") Long boxTypeId,
                                                        @RequestBody Map<String, Boolean> statusMap) {
        boolean newStatus = statusMap.get("enabled");
        boxTypeService.toggleBoxTypeStatus(boxTypeId, newStatus);
        return ResponseEntity.ok("Estado del tipo de caja ha sido cambiado exitosamente");
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoxType>> list() {
        List<BoxType> list = boxTypeService.findAll();
        return new ResponseEntity<List<BoxType>>(list, HttpStatus.OK);
    }
}
