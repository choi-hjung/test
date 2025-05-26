package com.example.springworkschedules.controller;

import com.example.springworkschedules.dto.ScheduleCreateRequestDto;
import com.example.springworkschedules.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    // 속성
    private final ScheduleService scheduleService;

    // 생성자
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    // 기능 - CRUD
    // 일정 생성
    @PostMapping
    public void create(@RequestBody ScheduleCreateRequestDto scheduleCreateRequestDto) {
        // 1. 일정 생성용 DTO 만들기
        // 2. 일정 생성 응답 DTO 만들기
        // 3. postman 연결확인하기
        // 4. 요청 DTO 에 담긴 데이터 확인해보기 => Getter 이용
        // 5. 서비스 만들기
        // 6. 서비스 연결하기
        scheduleService.createSchedule(scheduleCreateRequestDto);
    }

    // 일정 목록 조회
//    @GetMapping


    // 일정 상세 조회


    // 일정 삭제


}
