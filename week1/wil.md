\# 1주차 WIL



\## 학습한 내용

\- JDK 17 설치 및 환경변수 설정

\- IntelliJ IDEA 설치 및 Lombok 플러그인 설정

\- Spring Initializr로 프로젝트 생성 (Spring Web, Spring Data JPA, Lombok, H2 Database)

\- Spring Boot 애플리케이션 실행 확인



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

