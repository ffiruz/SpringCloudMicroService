package com.microservice.accountservice.model;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of={"id"})//iki objectin equeals ve hashcode eşitliği id ye göre
@ToString
@Table(value = "accounts")//Tablo ismi tanımladık
public class Account  implements Serializable {

    @PrimaryKey  //Entity tanımında ki @id gibi
    private  String id= UUID.randomUUID().toString();//Default olarak bir id tanımladık.

    @Column(value = "uname")
    private  String userName;

    @Column(value = "email")
    private String email;

    @Column(value = "pwd")
    private String passwd;

    @Column(value = "created_at")
    private Date createdDate;

    @Column(value = "is_active")
    private   Boolean active;


}
