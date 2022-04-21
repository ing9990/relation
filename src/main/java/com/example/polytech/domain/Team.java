package com.example.polytech.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author TaeWK
 */
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="TEAM")
public class Team {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TEAM_ID")
    private Long id; // 팀 아이디

    @Column(name="TEAM_TEAMNAME")
    private String teamname; // 팀 이름

    @Column(name="TEAM_CREATED_AT")
    private LocalDateTime created_at = LocalDateTime.now(); // 팀 생성 시간


    @OneToMany(mappedBy = "team")
    private List<Members> membersList = new ArrayList<>();

    
  // ------- 연관관계 편의 메소드 -------------------------------------------------//
    public void addMember(Members members){
        membersList.add(members);
    }

    public List<Members> getMemberList(){
        return membersList;
    }


}
