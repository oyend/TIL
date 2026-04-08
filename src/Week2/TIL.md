# 📘 Today I Learned

### 1. 오늘 배운 내용
- 객체지향
  - 클래스
  - 캡슐화
  - 함수
  - 생성자

공부 날짜: 2026.04.09.

### 2. 핵심 정리 (내 언어로)
1. **default 접근자**  
`public`, `private`, `protected`처럼 뭐 붙일 필요 없음! 패키지 내에서만 작동하게 됨
2. **캡슐화**  
기능을 제대로 나누지 않으면 불완전한 캡슐화가 진행될 수 있다! 아직은 로직 짤 때 머리에서 꼬임...미리 구상을 해놓고 구현할 때 더욱 주의해야 할 듯...
3. **접근자 사용**  
아직까지 `private`와 `default`의 필요성을 잘 모르겠다...추가로 공부하기
4. **생성자**  
생성자에는 콘솔 출력은 넣지 않기
5. **private 접근자 관련**  
generation 필드 초기화 할 때 _"필드 'generation'이(가) 'final'이 될 수 있습니다."_ -> 추가로 찾아보니 `final`은 변하지 않는 변수! C++의 `const`와 비슷하지만 `const`는 컴파일 중 값이 결정 / `fianl`은 프로그램 실행 중 생성자에 의해 초기화

### 3. 결과 이미지(스크린샷)
- step1  
  ![step1](https://github.com/oyend/TIL/blob/master/src/Week2/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-04-09%20023722.png)
- step2  
  ![step2](https://github.com/oyend/TIL/blob/master/src/Week2/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-04-09%20023751.png)
- step3  
  ![step3](https://github.com/oyend/TIL/blob/master/src/Week2/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-04-09%20023829.png)
- step3(오류)  
  ![step3_Error](https://github.com/oyend/TIL/blob/master/src/Week2/Pictures/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-04-09%20023853.png)

### 4. 느낀 점
이번주 PBL은 저번주에 진행한 자바 기초 문법보다는 생소한 개념이라 구현에 생각보다 오랜 시간이 걸렸다.  
다행히도 클래스, 캡슐화, 생성자 등 학습 내용들의 개념은 이미 알고 있어서 코드를 짜면서 크게 막혔던 부분은 없었다.  
약간이라도 예습을 진행해서인지 자바 언어도 금방 익숙해진 것 같다고 느꼈다. 저번주에 헷갈렸던 `sc.nextLine();` 부분도 완벽하게 이해했다!  
그래도 다음주에 상속, 다형성, 추상화 등 더 복잡한 개념&아직 생소한 인터페이스 개념 등이 있으니 자만하지 말고 더욱 기초를 탄탄히 해야겠다.