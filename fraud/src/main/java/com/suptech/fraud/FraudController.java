package com.suptech.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("api/v1/fraud-check")
public class FraudController {
    private FraudCheckService fraudCheckService;

    @GetMapping(path = "{customer_id}")
    public FraudCheckResponse isFraudster(@PathVariable Integer customer_id){
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customer_id);
        log.info("fraud check request for customer {}", customer_id);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
