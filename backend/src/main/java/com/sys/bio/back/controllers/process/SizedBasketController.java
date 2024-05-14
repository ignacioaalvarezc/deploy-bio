package com.sys.bio.back.controllers.process;

import com.lowagie.text.DocumentException;
import com.sys.bio.back.controllers.user.AuthenticationController;
import com.sys.bio.back.models.sized.SizedBox;
import com.sys.bio.back.services.process.sizing.SizedBasketService;
import com.sys.bio.back.utils.report.excel.SizedExporterExcel;
import com.sys.bio.back.utils.report.pdf.SizedExporterPDF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/sizedBaskets")
@CrossOrigin("*")
public class SizedBasketController {

    @Autowired
    private SizedBasketService sizedBasketService;


    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @PostMapping("/")
    public ResponseEntity<SizedBox> saveSizedBasket(@RequestBody SizedBox sizedBox) {
        return ResponseEntity.ok(sizedBasketService.addSizedBasket(sizedBox));
    }

    @PutMapping("/update/{sizedBasketId}")
    public ResponseEntity<SizedBox> updateSizedBasket(@PathVariable("sizedBasketId") Long sizedBasketId,
                                                      @Valid @RequestBody SizedBox sizedBox) {
        try {
            sizedBox.setSizedBoxId(sizedBasketId);
            SizedBox updatedSizedBox = sizedBasketService.updateSizedBasket(sizedBox);
            return ResponseEntity.ok(updatedSizedBox);
        } catch (Exception e) {
            log.error("Error al actualizar el canasto de dimensionado con ID: " + sizedBasketId, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> listSizedBaskets() {
        return ResponseEntity.ok(sizedBasketService.getSizedBaskets());
    }

    @GetMapping("/id/{sizedBasketId}")
    public SizedBox listSizedBasket(@PathVariable("sizedBasketId") Long sizedBasketId) {
        return sizedBasketService.getSizedBasket(sizedBasketId);
    }


    @DeleteMapping("/{sizedBasketId}")
    public void deleteSizedBasket(@PathVariable("sizedBasketId") Long sizedBasketId) {
        sizedBasketService.deleteSizedBasket(sizedBasketId);
    }


    @GetMapping("/date-filter")
    public ResponseEntity<List<SizedBox>> getFilteredSizedBaskets(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        List<SizedBox> filteredSizedBoxes = sizedBasketService.getSizedBasketsByDateRange(startDate, endDate);
        return new ResponseEntity<>(filteredSizedBoxes, HttpStatus.OK);
    }


    @GetMapping("/search")
    public ResponseEntity<List<SizedBox>> searchByResponsibleName(
            @RequestParam(value = "name", required = false) String name) {
        List<SizedBox> sizedBoxes = sizedBasketService.searchByResponsibleName(name);
        return new ResponseEntity<>(sizedBoxes, HttpStatus.OK);
    }

    @PostMapping("/exportPdf")
    public void exportSizedListToPdf(@RequestBody List<SizedBox> filteredSizedBoxes, HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDate = dateFormatter.format(new Date());

        String header = "Content-Disposition";
        String value = "attachment; filename=Dimensionados_" + currentDate + "pdf";
        response.setHeader(header, value);

        SizedExporterPDF exporter = new SizedExporterPDF(filteredSizedBoxes);
        exporter.export(response);
    }

    @PostMapping("/exportExcel")
    public void exportSizedListToExcel(@RequestBody List<SizedBox> filteredSizedBoxes, HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDate = dateFormatter.format(new Date());

        String header = "Content-Disposition";
        String value = "attachment; filename=Recepciones_" + currentDate + ".xlsx";
        response.setHeader(header, value);

        SizedExporterExcel exporter = new SizedExporterExcel(filteredSizedBoxes);
        exporter.export(response);
    }



}
