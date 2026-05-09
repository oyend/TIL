package package2;

import role.Lion;
import role.Role;
import role.Staff;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberRepository repo = null;
        System.out.println("저장소를 선택하세요: ");
        System.out.println("1. MemoryMemberRepository (실제 저장)");
        System.out.println("2. MockMemberRepository (더미 데이터)");
        System.out.print("선택: ");
        int cmdRepo = sc.nextInt();
        if (cmdRepo == 1){
            repo = new MemoryMemberRepository();
        } else if (cmdRepo == 2){
            repo = new MockMemberRepository();
        } else {
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
            return;
        }
        MemberService service = new MemberService(repo);
        while(true) {
            System.out.println();
            System.out.println("===== 멋사 멤버 관리 시스템 (Step 2: DI 적용) =====");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int cmd = sc.nextInt();
            if (cmd == 4) break;
            if (cmd == 1) {
                System.out.println("--- 멤버 등록 ---");
                System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
                int cmd1 = sc.nextInt();
                System.out.print("이름: ");
                String name = sc.next();
                System.out.print("전공: ");
                String major = sc.next();
                System.out.print("기수: ");
                int generation = sc.nextInt();
                System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
                String part = sc.next();
                Role newMember = null;
                if (cmd1 == 1) {
                    System.out.print("학번: ");
                    int id = sc.nextInt();
                    newMember = new Lion(name, major, generation, part, id);
                } else {
                    System.out.print("직책: ");
                    String position = sc.next();
                    newMember = new Staff(name, major, generation, part, position);
                }
                service.Register(newMember);
            }
            else if (cmd == 2) {
                System.out.println("--- 전체 멤버 목록 ---");
                List<Role> list = service.FindAll();
                String currClass = "";
                for (int i = 0; i < list.size(); i++) {
                    Role current = list.get(i);
                    if (current instanceof Lion) currClass = "아기사자";
                    else currClass = "운영진";
                    System.out.println((i+1)+". [" + currClass + "] " + current.getName() + " - " + current.getGeneration() + "기");
                }
                System.out.println("총 "+list.size()+"명");
            }
            else if(cmd == 3) {
                System.out.println("--- 이름으로 검색 ---");
                System.out.print("검색할 이름: ");
                String name = sc.next();
                System.out.println();
                // 검색 로직
                Role current = service.Search(name);
                if (current != null) {
                    System.out.println("[검색 결과]");
                    if (current instanceof Lion) {
                        System.out.println("역할: 아기사자");
                        System.out.println("이름: " + current.getName() + " | 전공: " + current.getMajor() + " | 기수: " + current.getGeneration() + " | 파트: " + current.getPart() + " | 학번: " + ((Lion) current).getId());
                        System.out.println("과제 제출 가능 여부: 가능");
                    } else {
                        System.out.println("역할: 운영진");
                        System.out.println("이름: " + current.getName() + " | 전공: " + current.getMajor() + " | 기수: " + current.getGeneration() + " | 파트: " + current.getPart() + " | 직책: " + ((Staff) current).getPosition());
                        System.out.println("과제 제출 가능 여부: 불가능");
                    }
                } else System.out.println("검색 결과를 찾을 수 없습니다.");
            }
        }
        sc.close();
    }
}