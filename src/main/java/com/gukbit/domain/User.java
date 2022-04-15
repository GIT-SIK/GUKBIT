package com.gukbit.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @Column
    String pw;

    @Column
    String nickname;

    @Column
    String email;

    @Column
    String tell;

    @Column
    int auth;

    @Column
    int rights;

    @Lob
    byte[] image;
}
