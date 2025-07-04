# ApplicationEventPublisher 활용 비지니스 의존성 분리 예제

이 프로젝트는 Spring Boot의 `ApplicationEventPublisher` 기능을 활용하여 비지니스의 분리하는 방법 및 이슈에 대한 처리 방법에 대해서 

## 프로젝트 개요

일반적인 서비스에서 메인 비즈니스 로직 외의 부가적인 후처리(예: 회원가입 후 메일 발송, 포인트 지급 등)는 메인 로직의 결합도를 높이고 성능에 영향을 줄 수 있습니다. 
이 프로젝트는 `ApplicationEventPublisher`를 사용하여 이러한 후처리 로직을 분리함으로써, 비즈니스 간의 결합도를 낮추고 비동기 처리를 통해 유연하고 확장 가능한 아키텍처를 구축하는 방법에 대한 내용입니다.

## 기술 스택

* **Spring Boot:** 3.x (버전 확인 필요)
* **Java:** 17+ (버전 확인 필요)
* **의존성 관리:** Gradle 

## 대상 글
https://crazy-code.tistory.com/12 , https://crazy-code.tistory.com/13
