package diegoVSC42.what_the_number.controller;

import diegoVSC42.what_the_number.domain.NumberInfo;
import diegoVSC42.what_the_number.service.NumberInfoService;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("number-info")
public class NumberInfoController {

    @GetMapping("/{number}")
    public ResponseEntity getNumberInfo(@PathVariable("number") Long number) {

        if(number < Long.MAX_VALUE){
            NumberInfoService service = new NumberInfoService();
            return ResponseEntity.ok(service.calculations(number));
        }
        String message = "The provided number is too large. Please provide a smaller number.";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
    }
}