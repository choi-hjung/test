package com.example.springworkschedules.dto;

import java.time.LocalDateTime;

public class ScheduleResponseDto {
    // 응답 - 사용자에게 보여줄 정보
    // 속성
    private Long id;
    private String title;
    private String todo;
    private String username;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // 생성자
//    public ScheduleResponseDto(
//            Long id, String title, String todo, String username,
//            LocalDateTime createdAt, LocalDateTime updatedAt
//    ) {
//        this.id = id;
//        this.title = title;
//        this.username = username;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }

    // 기능
//    public Long getId() {
//        return id;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public String getTodo() {
//        return todo;
//    }
//    public String getUsername() {
//        return username;
//    }
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
}
