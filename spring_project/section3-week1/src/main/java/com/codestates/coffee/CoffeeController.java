package com.codestates.coffee;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/v1/coffees")
public class CoffeeController {
    @PostMapping
    public ResponseEntity postCoffee(@RequestHeader("user-agent") String userAgent,
                                     @RequestParam("korName") String korName,
                                     @RequestParam("engName") String engName,
                                     @RequestParam("price") int price){
        System.out.println("user-agent " + userAgent);
        return new ResponseEntity<>(new Coffee(korName,engName,price),
                HttpStatus.CREATED);

    }

}
