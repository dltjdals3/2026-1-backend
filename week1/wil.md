# [1주차] 웹의 소통 방식, HTTP와 REST API

---
 
## 1. 웹이란?
 
- **인터넷**: 전 세계 컴퓨터와 기기를 연결하는 글로벌 네트워크
- **웹**: 인터넷 위에서 동작하는 서비스 중 하나로, 사용자들이 정보를 공유할 수 있는 공간
- 둘은 같은 개념이 아니다! 웹은 인터넷을 기반으로 동작하는 여러 서비스 중 하나일 뿐

### 클라이언트 - 서버 모델
| 구분 | 역할 |
|------|------|
| **클라이언트** | 요청(Request)을 보내고 응답 결과를 받아 사용 |
| **서버** | 요청을 받아 처리하고 응답(Response)을 반환 |

### 2. HTTP
* 웹에서 데이터를 주고받는 서버-클라이언트 모델의 프로토콜
* 클라이언트의 요청(request)과 서버의 응답(response)을 통해 작동
### 주요 특징
- **무상태성(Stateless)**: 서버는 클라이언트의 이전 요청을 기억하지 않고 매 요청을 독립적으로 처리
- **비연결성(Connectionless)**: 클라이언트가 요청을 보내고 응답을 받은 후 서버와 연결을 유지하지 않음
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



## Whitelabel Error Page 스크린샷
<img width="1766" height="600" alt="벡엔드 과제 홈페이지" src="https://github.com/user-attachments/assets/536409b4-09a8-4b90-9fa2-43754d4e3a46" />








## API 명세서

### 상품 기능
| 기능 | HTTP Method | URI |
|---|---|---|
| 상품 등록 | POST | /products |
| 상품 리스트 조회 | GET | /products |
| 상품 상세 조회 | GET | /products/{productId} |
| 상품 수정 | PATCH | /products/{productId} |
| 상품 삭제 | DELETE | /products/{productId} |

### 주문 기능
| 기능 | HTTP Method | URI |
|---|---|---|
| 주문 생성 | POST | /orders |
| 주문 리스트 조회 | GET | /orders |
| 주문 상세 조회 | GET | /orders/{orderId} |
| 주문 취소 | PATCH | /orders/{orderId} |



