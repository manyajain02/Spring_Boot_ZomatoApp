package com.springboot.Project.ZomatoApp.entities;

import com.springboot.Project.ZomatoApp.entities.enums.TransactionMethod;
import com.springboot.Project.ZomatoApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double balance;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    @ManyToOne
//    private Ride ride;
        private Customer customer;

    private String transactionId;

    @ManyToOne
    private Wallet wallet;

    @CreationTimestamp
    private LocalDateTime timeStamp;

}
