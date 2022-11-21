package com.suptech.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
    }

    public boolean isFraudulentCustomer(Integer customer_id){
        // Check if customer has ....
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customer_id(customer_id)
                        .isFraudster(false) // Metier
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false ;
    }
}
