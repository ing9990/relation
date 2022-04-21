package com.example.polytech.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author TaeWK
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
@Getter
@Setter
@Table(name = "MEMBERS")
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBERS_ID")
    private Long id;         //아이디


    @Column(name = "MEMBERS_USERNAME")
    private String username; // 이름

    @Column(name = "MEMBERS_AGE")
    private int age;         //나이


    @Column(name = "MEMBERS_CREATED_AT")
    private LocalDateTime created_at = LocalDateTime.now(); // user 생성 시간.

    @ManyToOne
    @JoinColumn(name="TEAM_ID") //FK의 이름.
    private Team team;

}














