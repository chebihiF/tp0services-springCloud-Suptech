package com.suptech.fraud;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class FraudCheckHistory {
    @SequenceGenerator(
            name = "fraud_id_sequence",
            sequenceName = "fraud_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fraud_id_sequence"
    )
    @Id
    private Integer id ;
    private Integer customer_id;
    private Boolean isFraudster ;
    private LocalDateTime createdAt ;
}
