package org.sopt.sopkathonweb1.domain;

import jakarta.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    private String name;

    //tmi
    private String content;

    @Builder
    public Member(Room room, String name, String content) {
        /*this.userId = userId;*/
        this.room = room;
        this.name = name;
        this.content = content;
    }

    public static Member create(Room room, String name, String content) {

        return new Member(room, name, content);
    }
}
