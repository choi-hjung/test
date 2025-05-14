API 명세서 작성하기
| 기능 | Method | URL | request | response |
| --- | --- | --- | --- | --- |
| 사용자 등록 | POST | /api/users/signup | 요청 body | 사용자 등록 정보 |
| 로그인 | POST | /api/users/login | 요청 body | 로그인 성공 정보 |
| 일정 등록 | POST | /api/schedules | 요청 body | 일정 등록 정보 |
| 일정 조회 | GET | /api/schedules/{schedule_id} | 요청 param | 일정 단건 응답 정보 |
| 일정 목록 조회 | GET | /api/schedules | 요청 param | 일정 목록 응답 정보 |
| 일정 수정 | PUT | /api/schedules/{schedule_id} | 요청 body | 일정 수정 정보 |
| 일정 삭제 | DELETE | /api/schedules/{schedule_id} | 요청 param | 일정 삭제 정보 |
