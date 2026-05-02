# 📘 Today I Learned

### 1. 오늘 배운 내용
- Java Collections(list, map)  

공부 날짜: 2026.05.02.

### 2. 핵심 정리 (내 언어로)
1. Java Collections: 자료구조 모음 -> 프레임워크로 제공됨
2. List: 일반적으로 우리가 아는 list 자료형(순서가 있고 중복을 허용함)
   - `List<Role> list = new ArrayList<Role>();` -> 리스트 선언
   - `list.add(new Lion(name, major, generation, part, id));` -> 리스트에 원소 추가
   - `current instanceof Lion` -> 객체(current)가 클래스(Lion)인지 확인 / true, false 반환
3. Map: 파이썬의 딕셔너리와 비슷한 듯...key와 value가 각각 대응하는 형태
    - `Map<String, List<Role>> groupMap = new HashMap<>();` -> 맵 선언
    - `nameMap.put(name, member);` -> 맵에 원소 추가
    - `groupMap.computeIfAbsent(part, k-> new ArrayList<>()).add(member);` -> 맵에 키(part)가 있는지 확인하고, 없으면 새로운 ArrayList를 추가하여 member 추가
    - `Role foundMem = nameMap.get(searchName);` -> 맵에서 키에 대응하는 값을 가져와 저장


### 3. 결과 이미지(스크린샷)
1. Main(package1)  
![package1-1](src/Week4/Pictures/스크린샷 2026-05-03 005703.png)  
![package1-2](src/Week4/Pictures/스크린샷 2026-05-03 005943.png)

2. Main(package2)  
![package2-1](src/Week4/Pictures/스크린샷 2026-05-03 002954.png)  
![package2-2](src/Week4/Pictures/스크린샷 2026-05-03 003353.png)  
![package2-3](src/Week4/Pictures/스크린샷 2026-05-03 003439.png)

### 4. 느낀 점
- 처음에 map이라는 새로운 형태로 접근했을 때는 어떻게 학습해야 할지 막막함을 느꼈으나, 공부하다보니 파이썬의 딕셔너리와 상당히 유사해서 초반만큼 어려움을 느끼지는 않았다.  
- 패키지1에서 리스트로 구현을 했다가 패키지2에서 같은 내용을 맵으로 수정해서 구현하는 과정이 상당히 헷갈리고 어려웠다. 처음에는 하나의 맵으로 구현하려 했으나, 이름 검색과 파트 검색이 각각 하나의 맵을 가지고 있는 게 코드가 더 직관적일 거 같아 이름 검색에 사용하는 맵과 파트 검색에 사용하는 맵을 나누었다. 
- 어찌저찌 구현하기는 했지만, 코드를 다시 살펴보며 관련 함수나 로직 흐름을 정리하는 시간을 추가로 가져야겠다고 다짐했다. 
