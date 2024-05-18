package org.sopt.sopkathonweb1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userId;

    private String name;

    //tmi
    private String content;

    public User(String userId, String name, String content) {
        this.userId = userId;
        this.name = name;
        this.content = content;
    }



    public static User create(String userId, String name, String content) {
        return new User(userId, name, content);
    }
}
