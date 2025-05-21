# 일정 등록

[일정 목록 조회](https://www.notion.so/1f99d57b6c8c8092a153c9df9fb8ab1e?pvs=21)

[일정 상세 조회](https://www.notion.so/1f99d57b6c8c80f79276f4fb225e6f17?pvs=21)

[일정 수정](https://www.notion.so/1f99d57b6c8c80c099f3ce4b2ffd4351?pvs=21)

[일정 삭제](https://www.notion.so/1f99d57b6c8c80128e8bdcccf20a0b1d?pvs=21)



# 단일 테이블

테이블이름: `schedules`

| 컬럼명 | 데이터 타입 | 키 | NULL 허용 | 설명 | 기본값 |
| --- | --- | --- | --- | --- | --- |
| id | BIGINT | PK (AUTO_INCREMENT) | N | 일정 ID | - |
| title | VARCHAR(25) | - | N | 할 일 제목 | - |
| username | VARCHAR(10) | - | N | 작성자 | - |
| password | VARCHAR(255) | - | N | 비밀번호 | - |
| created_at | DATETIME | - | N | 생성일 | CURRENT_TIMESTAMP |
| updated_at | DATETIME | - | N | 수정일 | ON UPDATE CURRENT_TIMESTAMP |
