# 📘 Today I Learned

### 1. 오늘 배운 내용
- IoC/DI  

공부 날짜: 2026.05.10.

### 2. 핵심 정리 (내 언어로)
- IoC(제어의 역전): 객체 생성과 의존성 관리를 외부로 넘기는 것
  - 서비스가 어떤 레포에 접근을 해서 데이터를 저장할 지 모름(권한을 넘겼으니까)
- DI(의존성 주입): 하나의 객체가 다른 객체의 의존성을 제공
  - 의존성 주입 안하면: 서비스가 레포에 의존하는 구조 -> 레포가 없으면 서비스가 안 돌아감
  - 의존성 주입하면: 규격에 맞는 어떤 저장소든 올 수 있음
- `MemberRepository`: 레포지토리의 규칙을 설정(이런 함수들이 포함되어야 한다)
- `MemoryMemberRopisitory`: 실제로 데이터를 저장하는 레포지토리
- `MockMemberRepository`: 가짜로 데이터를 저장하는 레포지토리
  - 왜 사용하는가?: 코드가 잘 실행되는지 확인하기 위함
- `MemberService`: 레포지토리를 토대로 실제 로직을 작성
  - 어떤 레포지로 설정하느냐에 따라 결과가 달라짐

### 3. 결과 이미지(스크린샷)
1. Main(package1)  
   ![package1-1](https://github.com/oyend/TIL/blob/master/src/Week5/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-05-10%20023907.png)  
   ![package1-2](https://github.com/oyend/TIL/blob/master/src/Week5/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-05-10%20023919.png)
2. Main(package2)  
   ![package2-1](https://github.com/oyend/TIL/blob/master/src/Week5/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-05-10%20021750.png)   
   ![package2-2](https://github.com/oyend/TIL/blob/master/src/Week5/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-05-10%20021805.png)  
   ![package2-3](https://github.com/oyend/TIL/blob/master/src/Week5/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-05-10%20023233.png)  
   ![package2-4](https://github.com/oyend/TIL/blob/master/src/Week5/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-05-10%20023239.png)

### 4. 느낀 점
- 이번 PBL은 처음부터 어려웠다. 왜 `MockMemberRepository`를 사용하는지를 이해하지 못해서 관련 내용을 서치하는 데에도 상당한 시간을 사용했고, IoC와 DL 등 단어가 어려워서 더욱 헷갈렸다.
- 이번 주는 저번 주에 작성한 코드를 토대로 함수로 구현했는데, 레포지토리 클래스에는 어떤 기능까지를 넣고, 서비스 클래스에는 어떤 기능까지를 넣어야 하는지가 많이 헷갈렸다. 이 부분은 지속적으로 취약하다고 느꼈기 때문에 제대로 보완을 진행해야 할 것 같다.
- 이미 작성된 코드를 토대로 진행했음에도 약 4-5시간 정도가 소요되었다. 과제를 할 때마다 속도가 느린 편인 것 같아서 조금 더 이런 개념에 익숙해져야겠다고 다짐했다.