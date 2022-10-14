package com.mibrahimuadev.myecommerce.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping("/")
    public ResponseEntity<String> greeting() {
        return new ResponseEntity<>("helloo from customer",HttpStatus.OK);
    }
}
