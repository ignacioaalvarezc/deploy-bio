package com.sys.bio.back.controllers.item;


import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.item.SecurityItem;
import com.sys.bio.back.services.item.SecurityItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/securityItems")
@CrossOrigin("*")
public class SecurityItemController {

    @Autowired
    private SecurityItemService itemService;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);


    @PostMapping("/")
    public ResponseEntity<SecurityItem> saveSecurityItem(@RequestBody SecurityItem securityItem) {
        return ResponseEntity.ok(itemService.addSecurityItem(securityItem));
    }

    @PutMapping("/update/{securityItemId}")
    public ResponseEntity<SecurityItem> updateSecurityItem(@PathVariable("securityItemId") Long securityItemId,
                                               @Valid @RequestBody SecurityItem securityItem) {
        try {
            securityItem.setSecurityItemId(securityItemId);
            SecurityItem updatedSecurityItem = itemService.updateSecurityItem(securityItem);
            return ResponseEntity.ok(updatedSecurityItem);
        } catch (Exception e) {
            log.error("Error al actualizar el item de seguridad con ID: " + securityItemId, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> listSecurityItems() {
        return ResponseEntity.ok(itemService.getSecurityItems());
    }

    @GetMapping("/id/{securityItemId}")
    public SecurityItem listSecurityItem(@PathVariable("securityItemId") Long securityItemId) {
        return itemService.getSecurityItem(securityItemId);
    }


    @DeleteMapping("/{securityItemId}")
    public void deleteSecurityItem(@PathVariable("securityItemId") Long securityItemId) {
        itemService.deleteSecurityItem(securityItemId);
    }
}
