package com.example.springworkschedules.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter // 게터만 단독사용 : setter를 쓰면 entity 변경 위험.
// 롬복 사용 이유는 개발하기 편하려고! 하지만, 내가 원하는 것만 게터가 되진 않음.
// @Getter 를 사용하면 위험(캡슐화)
@NoArgsConstructor(access = AccessLevel.PUBLIC) // AccessLevel.PROTECTED -> Entity에 외부접근 차단
@Table(name = "schedules")
public class Schedule extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 값 생성
    private Long id;

    @Column(length = 25, nullable = false)
    private String title;

    @Column(length = 300, nullable = false)
    private String todo;

    @Column(length = 10, nullable = false)
    private String username;

//    @CurrentTimestamp -> 없는 어노테이션 creation /update로 사용하기
//    @CreatedDate
//    @Column(nullable = false, updatable = false) // 읽기 전용(수정X)
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime created_at;
//
//    @LastModifiedDate
//    @Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime updated_at;

    // 생성자
//    public Schedule(){
//        // -> 기본생성자
//        // ( = @NoArgsConstructor)
//    }
     public Schedule(String title, String todo, String username) {
         this.title = title;
         this.todo = todo;
         this.username = username;
     }
}
