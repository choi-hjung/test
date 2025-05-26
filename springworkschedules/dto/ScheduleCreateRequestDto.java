package com.example.springworkschedules.dto;

public class ScheduleCreateRequestDto {
    // 요청 - 사용자가 입력한 정보
    // 속성
    private String title;
    private String todo;
    private String username;

    // 생성자
//    public ScheduleRequestDto(String title, String todo, String username) {
//        this.title = title;
//        this.todo = todo;
//        this.username = username;
//    }

    // 기능
    public String getTitle() {
        return title;
    }
    public String getTodo() {
        return todo;
    }
    public String getUsername() {
        return username;
    }
}
