package org.sopt.sopkathonweb1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "room_id")
    private Long roomId;

    private String name;

    //tmi
    private String content;

    @Builder
    public Member(String name, String content) {
        /*this.userId = userId;*/
        this.name = name;
        this.content = content;
    }

    public static Member create( String name, String content) {
        return new Member( name, content);
    }
}
