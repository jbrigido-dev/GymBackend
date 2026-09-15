package com.jbrigido.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100, nullable = false)
    private String lastname;
    @Column(nullable = false)
    private LocalDate birth;
    @OneToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;
    @OneToMany(mappedBy = "chargedUser")
    private List<PaymentMembership> listPaymentMembership;
}
