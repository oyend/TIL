package Week2.Pack1;

import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        // 아기사자 정보 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("아기사자 이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println("전공을 입력해주세요.");
        String major = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        int generation = sc.nextInt();

        // 검증 로직을 Lion 클래스로 이동하기
        Lion lion = new Lion(name, major, generation);
        lion.printProfile();
    }
}
