package com.project.login.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
@Table(name = "td_pengguna", schema = "login")
public class TdPengguna implements Serializable {

    //	id_pengguna uuid NOT NULL,
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(name = "id_pengguna",length = 36, nullable = false)
    private UUID id_pengguna;
    //	nama varchar(30) NULL,
    @Column(name = "nama", length = 30, nullable = true)
    private String nama;
    //	username varchar(20) NULL,
    @Column(name = "username", length = 20, nullable = true)
    private String username;
    //	email varchar(20) NULL,
    @Column(name = "email", length = 20, nullable = true)
    private String email;
    //	psw varchar(100) NULL,
    @Column(name = "psw", length = 100, nullable = true)
    private String psw;
    //	created_date date NULL,
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    //	updated_date date NULL,
    @Column(name = "updated_date", nullable = true)
    private Date updatedDate;
}
