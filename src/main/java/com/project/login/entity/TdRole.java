package com.project.login.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Setter
@Getter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "td_role", schema = "login")
public class TdRole implements Serializable {

    //CREATE TABLE login.td_role (
    //	id_role int4 NOT NULL,
    @Id
    @Column(name = "id_pengguna", nullable = false)
    private UUID id_pengguna;
    //	nama varchar(30) NULL,
    @Column(name = "nama",length = 30, nullable = true)
    private String nama;
    //	created_date date NULL,
    @Column(name = "created_date",nullable = true)
    private Date createdDate;
    //	updated_date date NULL,
    @Column(name = "updated_date",nullable = true)
    private Date updatedDate;

}
