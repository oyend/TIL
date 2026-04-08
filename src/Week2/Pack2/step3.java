package Week2.Pack2;
import Week2.Pack1.Lion;

public class step3 {
    public static void main(String[] args) {
        // 접근 제어자에 따른 필드 접근 차이 확인
        System.out.println("아기사자 객체를 생성합니다.");
        Lion lion = new Lion("김멋대", "컴퓨터공학과", 14);
        lion.print();
        System.out.println();
        System.out.println("Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("name 필드 값을 변경합니다.");
        lion.name = "홍길동";
        System.out.println("public 필드 접근 성공");
        lion.print();

        /* default 필드에 접근을 시도한 경우(오류)
        System.out.println("Step 3-2. default 필드 접근을 시도합니다.");
        System.out.println("major 필드 값을 변경합니다.");
        lion.major = "정보통신공학과";
        lion.print();

        // private 필드에 접근을 시도한 경우(오류)
        System.out.println("Step 3-3. private 필드 접근을 시도합니다.");
        System.out.println("generation 필드 값을 변경합니다.");
        lion.generation = 13;
        lion.print(); */
    }
}
