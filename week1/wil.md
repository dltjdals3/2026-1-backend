# [1주차] 웹의 소통 방식, HTTP와 REST API

## 배운 내용 

### 1. 웹(Web)과 클라이언트-서버(Client-Server) 모델
* **클라이언트(Client)**: 서버(Server)에 요청(Request)을 보내고 응답(Response) 결과를 받아 사용하는 주체입니다.
* **서버(Server)**: 클라이언트(Client)의 요청(Request)을 받아 처리하고 응답(Response)을 반환합니다.
* **프론트엔드(Front-end)와 백엔드(Back-end)**: 프론트엔드(Front-end)는 사용자가 직접 보는 화면(UI)을 구성하고, 백엔드(Back-end)는 보이지 않는 데이터 처리와 저장을 담당합니다.
* **데이터베이스(Database, DB)**: 백엔드(Back-end) 서버가 다루는 데이터를 체계적으로 모아둔 저장소입니다.
* **URL(Uniform Resource Locator)**: 웹 상의 자원 위치를 나타내는 주소입니다. 프로토콜(Protocol), 호스트(Host), 포트(Port), 경로(Path), 쿼리(Query) 등으로 구성됩니다.

### 2. HTTP(HyperText Transfer Protocol)
* 웹에서 데이터를 주고받는 통신 프로토콜(Protocol)입니다.
* **특징**: 이전 요청을 기억하지 않는 무상태성(Stateless)과 통신 후 연결을 끊는 비연결성(Connectionless)을 가집니다.
* **HTTP 메서드(HTTP Method)**:
  * `GET`: 자원(Resource) 조회
  * `POST`: 자원(Resource) 추가 및 등록
  * `PUT`: 자원(Resource) 교체 (없으면 새로 생성)
  * `PATCH`: 자원(Resource)의 일부 수정
  * `DELETE`: 자원(Resource) 삭제
* **상태 코드(Status Code)**: 200(성공), 201(생성됨), 400(잘못된 요청), 404(찾을 수 없음), 500(서버 내부 오류) 등이 있습니다.

### 3. API(Application Programming Interface)와 REST API
* **API**: 프로그램 간 기능이나 데이터를 사용할 수 있도록 미리 정해둔 규칙이자 소통 창구입니다.
* **REST API**: HTTP의 장점을 살린 아키텍처(Architecture)입니다. 자원(Resource)은 URI로, 행위(Verb)는 HTTP 메서드(Method)로, 표현(Representation)은 JSON 형식으로 나타내는 웹 서비스 설계 방식입니다.

### 4. 스프링(Spring)과 스프링 부트(Spring Boot)
* **프레임워크(Framework)**: 개발을 효율적으로 할 수 있도록 기본 구조를 제공하는 뼈대(틀)입니다.
* **스프링(Spring)**: 자바(Java) 기반의 강력한 백엔드(Back-end) 프레임워크(Framework)입니다.
* **스프링 부트(Spring Boot)**: 복잡한 초기 설정 없이 스프링(Spring)을 빠르고 쉽게 사용할 수 있게 해주는 도구입니다.

---

## 📝 주차별 과제 (Assignments)
* [x] Spring Boot 개발 환경 세팅 및 실행하기
* [x] 온라인 쇼핑몰 프로젝트 API 명세서 작성하기
* [x] 강의 내용 정리한 WIL 작성하기



\## Whitelabel Error Page 스크린샷
<img width="1766" height="600" alt="벡엔드 과제 홈페이지" src="https://github.com/user-attachments/assets/536409b4-09a8-4b90-9fa2-43754d4e3a46" />




\## API 명세서



\### 상품 기능

| 기능 | HTTP Method | URI |

|---|---|---|

| 상품 등록 | POST | /products |

| 상품 리스트 조회 | GET | /products |

| 상품 상세 조회 | GET | /products/{productId} |

| 상품 수정 | PATCH | /products/{productId} |

| 상품 삭제 | DELETE | /products/{productId} |



\### 주문 기능

| 기능 | HTTP Method | URI |

|---|---|---|

| 주문 생성 | POST | /orders |

| 주문 리스트 조회 | GET | /orders |

| 주문 상세 조회 | GET | /orders/{orderId} |

| 주문 취소 | PATCH | /orders/{orderId} |

