package com.juaracoding.azrspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author Allysa Zahra Ramadhina
Java Developer
Created on 07/12/2023 17:06
@Last Modified 07/12/2023 17:06
Version 1.0
*/

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "MstTugasA")
public class TugasA {

    @Id
    @Column(name = "IDTugasA", columnDefinition = "varchar(255)", nullable = false)
    private String idTugasA;

    @Column(name = "Nama", columnDefinition = "varchar(40)", nullable = false)
    private String nama;

    @Column(name = "Alamat", columnDefinition = "varchar(500)", nullable = false)
    private String alamat;

    @Column(name = "TanggalLahir", columnDefinition = "date", nullable = false)
    private LocalDate tanggalLahir;

    @Column(name = "JenisKelamin", columnDefinition = "char(1)", nullable = false)
    private String jenisKelamin;

    @Column(name = "MasihHidup", columnDefinition = "bit", nullable = false)
    private Boolean masihHidup;

    @Column(name = "CreatedDate", columnDefinition = "datetime2(7)", nullable = false)
    private Date createdDate;

    @Column(name = "CreatedBy", columnDefinition = "int", nullable = false)
    private Integer createdBy;

    @Column(name = "ModifiedDate", columnDefinition = "datetime2(7)")
    private Date modifiedDate;

    @Column(name = "ModifiedBy", columnDefinition = "int")
    private Integer modifiedBy;

    @Column(name = "IsDelete", columnDefinition = "smallint", nullable = false)
    private Short isDelete;
}
