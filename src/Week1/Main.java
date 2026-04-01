package Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true) {
            System.out.println("지정할 아기사자 수를 5 이상 입력해주세요.");
            n = sc.nextInt();
            if (n < 5) System.out.println("[오류] 5 이상 입력해주세요.");
            else break;
        }
        sc.nextLine();
        String[] names = new String[n];

        System.out.println("아기사자 이름을 입력해주세요.");
        for(int i=0;i<n;i++) names[i] = sc.nextLine();
        System.out.println("\n아기사자 명단을 최종적으로 출력합니다.");
        for(int i=0;i<n;i++) System.out.println((i+1) + ". " + names[i]);
    }
}