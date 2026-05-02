package package2;

import role.Lion;
import role.Role;
import role.Staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Map<String, List<Role>> groupMap = new HashMap<>();
        Map<String, Role> nameMap = new HashMap<>();
        List<Role> list = new ArrayList<Role>();
        Scanner sc = new Scanner(System.in);
        int cmd = 0;
        while(true){
            System.out.println("====== 멤버 관리 시스템 ======");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 파트별 조회");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            cmd = sc.nextInt();
            if (cmd == 5) break;
            if (cmd == 1) {
                System.out.println("--- 멤버 등록 ---");
                System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
                int cmd1 = sc.nextInt();
                System.out.print("이름: ");
                String name = sc.next();
                if(nameMap.containsKey(name)){
                    System.out.println("등록 실패: 이미 존재하는 이름입니다.\n");
                    continue;
                }
                System.out.print("전공: ");
                String major = sc.next();
                System.out.print("기수: ");
                int generation = sc.nextInt();
                System.out.print("파트 (백엔드/프론트엔드): ");
                String part = sc.next();
                Role member;
                String group;
                if (cmd1 == 1) {
                    group = "아기사자";
                    System.out.print("학번: ");
                    int id = sc.nextInt();
                    member = new Lion(name, major, generation, part, id);
                } else {
                    group = "운영진";
                    System.out.print("직책: ");
                    String position = sc.next();
                    member = new Staff(name, major, generation, part, position);
                }
                nameMap.put(name, member);
                groupMap.computeIfAbsent(part, k-> new ArrayList<>()).add(member);
                System.out.println("등록 완료: "+name);
            }
            else if (cmd == 2) {
                System.out.println("--- 전체 멤버 목록 ---");
                if(nameMap.isEmpty()) {
                    System.out.println("멤버가 없습니다.");
                } else {
                String currClass = "";
                List<Role> valueList = new ArrayList<>(nameMap.values());
                for (int i = 0; i < nameMap.size(); i++) {
                    Role current = valueList.get(i);
                    if (current instanceof Lion) currClass = "아기사자";
                    else currClass = "운영진";
                    System.out.println((i + 1) + ". [" + currClass + "] " + current.getName() + " - " + current.getGeneration() + "기");
                    }
                }
            }
            else if(cmd == 3){
                boolean found = false;
                System.out.println("--- 이름으로 검색 ---");
                System.out.print("검색할 이름: ");
                String searchName = sc.next();
                System.out.println();
                // 검색 로직
                Role foundMem = nameMap.get(searchName);
                if(foundMem != null) {
                    System.out.println("[검색 결과]");
                    if (foundMem instanceof Lion) {
                        System.out.println("역할: 아기사자");
                        System.out.println("이름: " + foundMem.getName() + " | 전공: " + foundMem.getMajor() + " | 기수: " + foundMem.getGeneration() + " | 파트: " + foundMem.getPart() + " | 학번: " + ((Lion) foundMem).getId());
                        System.out.println("과제 제출 가능 여부: 가능");
                    } else {
                        System.out.println("역할: 운영진");
                        System.out.println("이름: " + foundMem.getName() + " | 전공: " + foundMem.getMajor() + " | 기수: " + foundMem.getGeneration() + " | 파트: " + foundMem.getPart() + " | 직책: " + ((Staff) foundMem).getPosition());
                        System.out.println("과제 제출 가능 여부: 불가능");
                    }
                }
                else System.out.println("검색 결과를 찾을 수 없습니다.");
            }
            else if(cmd == 4) {
                System.out.println("--- 파트별 검색 ---");
                System.out.println("등록된 파트: [백엔드, 프론트엔드]");
                System.out.print("조회할 파트: ");
                String searchGroup = sc.next();
                List<Role> groupList = groupMap.get(searchGroup);
                if(groupList != null && !groupList.isEmpty()){
                    System.out.println("["+searchGroup+" 파트 멤버]");
                    for(int i=0;i<groupList.size();i++){
                        Role member = groupList.get(i);
                        if (member instanceof Lion) System.out.println((i + 1) + ". " + groupList.get(i).getName() + " (아기사자) - "+groupList.get(i).getGeneration()+"기");
                        else System.out.println((i + 1) + ". " + groupList.get(i).getName() + " (운영진) - "+groupList.get(i).getGeneration()+"기");
                    }
                }
                else System.out.println("검색 결과를 찾을 수 없습니다.");
        }
    }
        sc.close();
}
        }