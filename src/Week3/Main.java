package Week3;

import java.util.Scanner;
import Week3.role.Lion;
import Week3.role.Staff;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======= 아기사자 정보 입력 =======");
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("전공: ");
        String major = sc.next();
        System.out.print("기수: ");
        int generation = sc.nextInt();
        System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
        String part = sc.next();
        System.out.print("학번: ");
        int id = sc.nextInt();
        Lion lion = new Lion(name, major, generation, part, id);

        System.out.println("\n======= 운영진 정보 입력 =======");
        System.out.print("이름: ");
        name = sc.next();
        System.out.print("전공: ");
        major = sc.next();
        System.out.print("기수: ");
        generation = sc.nextInt();
        System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
        part = sc.next();
        System.out.print("직책 (대표/부대표/파트장/멘토): ");
        String position = sc.next();
        Staff staff = new Staff(name, major, generation, part, position);

        System.out.println("\n======= 결과 출력 =======\n");
        lion.DisplayInfo();
        staff.DisplayInfo();
    }
}