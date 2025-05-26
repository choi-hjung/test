package com.example.springworkschedules.service;

import com.example.springworkschedules.domain.Schedule;
import com.example.springworkschedules.dto.ScheduleCreateRequestDto;
import com.example.springworkschedules.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    // 속성
    private final ScheduleRepository scheduleRepository;

    // 생성자
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    // 기능 - CRUD
    // 일정 생성
    public void createSchedule(ScheduleCreateRequestDto scheduleCreateRequestDto) {
        // 스케쥴 생성
        // -> 1. 데이터 필요 : 매개변수로 전달 받아야함.
//        String title = scheduleCreateRequestDto.getTitle();
//        String todo = scheduleCreateRequestDto.getTodo();
//        String username = scheduleCreateRequestDto.getUsername();
        // 반환 값 만들어주기
//        Schedule schedule = new Schedule(title, todo, username);

        // => 합치기
        Schedule schedule = new Schedule(
                scheduleCreateRequestDto.getTitle(), scheduleCreateRequestDto.getTodo(), scheduleCreateRequestDto.getUsername()
        );
        scheduleRepository.save(schedule);
    }

    // 일정 목록 조회


    // 일정 상세 조회


    // 일정 삭제


}
