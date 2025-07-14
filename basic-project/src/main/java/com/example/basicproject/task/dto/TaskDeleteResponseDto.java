package com.example.basicproject.task.dto;

public class TaskDeleteResponseDto {
    // 속성
    private int status;
    private String message;

    // 생성자
    public TaskDeleteResponseDto(int status, String message) {
        this.status = status;
        this.message = message;
    }

    // 기능
    public int getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
}
