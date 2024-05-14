package com.sys.bio.back.controllers.order;

import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.order.OrderProduct;
import com.sys.bio.back.services.order.OrderProductService;
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
@RequestMapping("/orderProducts")
@CrossOrigin("*")
public class OrderProductController {

    @Autowired
    private OrderProductService orderProductService;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);


    @PostMapping("/")
    public ResponseEntity<OrderProduct> saveOrderProduct(@RequestBody OrderProduct orderProduct) {
        OrderProduct savedOrderProduct = orderProductService.addOrderProduct(orderProduct);
        return ResponseEntity.ok(savedOrderProduct);
    }

    @GetMapping("/id/{orderProductId}")
    @RequestMapping(method = RequestMethod.GET, path = "/id/{orderProductId}")
    public OrderProduct listOrderProductById(@PathVariable("orderProductId") Long orderProductId) {
        return orderProductService.getOrderProduct(orderProductId);
    }

    @GetMapping("/")
    public ResponseEntity<?> orderProductList() {
        return ResponseEntity.ok(orderProductService.getOrderProducts());
    }

    @PutMapping("/update/{orderProductId}")
    public ResponseEntity<OrderProduct> updateOrderProduct(@PathVariable("orderProductId") Long orderProductId,
                                                 @Valid @RequestBody OrderProduct orderProduct) {
        try {
            orderProduct.setOrderProductId(orderProductId);
            OrderProduct updatedOrderProduct = orderProductService.updateOrderProduct(orderProduct);
            return ResponseEntity.ok(updatedOrderProduct);
        } catch (Exception e){
            log.error("Error al actualizar el producto de orden con ID: " + orderProductId, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{orderProductId}")
    public void deleteOrderProduct(@PathVariable("orderProductId") Long orderProductId) {
        orderProductService.deleteOrderProduct(orderProductId);
    }

    @PutMapping("/toggle-status/{orderProductId}")
    public ResponseEntity<String> toggleOrderProductStatus(@PathVariable("orderProductId") Long orderProductId,
                                                        @RequestBody Map<String, Boolean> statusMap) {
        boolean newStatus = statusMap.get("enabled");
        orderProductService.toggleOrderProductStatus(orderProductId, newStatus);
        return ResponseEntity.ok("Estado del producto de orden ha sido cambiado exitosamente");
    }

    @GetMapping("/list")
    public ResponseEntity<List<OrderProduct>> list() {
        List<OrderProduct> list = orderProductService.findAll();
        return new ResponseEntity<List<OrderProduct>>(list, HttpStatus.OK);
    }
}
