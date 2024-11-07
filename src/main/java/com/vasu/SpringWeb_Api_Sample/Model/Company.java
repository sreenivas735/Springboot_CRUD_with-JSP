package com.vasu.SpringWeb_Api_Sample.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String customer;
    private String customergender;
    private long customerphone;
    private String customeraddress;
    private String product;
    private String model;
    private String price;
    private String date;
    private String payment;


}
