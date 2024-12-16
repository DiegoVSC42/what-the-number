package diegoVSC42.what_the_number.controller;

import diegoVSC42.what_the_number.domain.NumberInfo;
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
        diegoVSC42.what_the_number.domain.NumberInfo numberInfo = new diegoVSC42.what_the_number.domain.NumberInfo();
        numberInfo.calculateBNP(number);
        numberInfo.calculateSP(number);
        numberInfo.calculateANP(number);
        return ResponseEntity.ok(numberInfo);
    }
}