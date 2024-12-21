package diegoVSC42.what_the_number.controller;

import diegoVSC42.what_the_number.domain.NumberInfo;
import diegoVSC42.what_the_number.service.NumberInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("number-info")
public class NumberInfoController {

    @GetMapping("/{number}")
    public ResponseEntity<NumberInfo> getNumberInfo(@PathVariable("number") Long number) {

        NumberInfoService service = new NumberInfoService();
        return ResponseEntity.ok(service.calculations(Math.abs(number)));

    }
}