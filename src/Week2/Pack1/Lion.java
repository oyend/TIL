package Week2.Pack1;

public class Lion {
    // Lion 필드 선언 및 기본 구조 설계
    public String name;
    String major;
    private int generation;

    public Lion(String n, String m, int s) {
        this.name = n;
        this.major = m;
        this.generation = s;
    }
    // 검증 로직을 Lion 클래스로 이동하기
    public boolean validation() {
        System.out.println("객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");
        if(name.isEmpty()) {
            System.out.println("이름이 비어 있습니다.");
            return false;
        }
        if(major.isEmpty()) {
            System.out.println("전공이 비어 있습니다.");
            return false;
        }
        if(generation<1) {
            System.out.println("기수가 1 미만입니다.");
            return false;
        }
        return true;
    }
    public void print(){
        System.out.println("아기사자 정보를 출력합니다.");
        System.out.println("이름: " + this.name + " | 전공: " + this.major + " | 기수: " + this.generation);
    }
    public void printProfile() {
        if (this.validation()) {
            System.out.println("아기사자 객체가 자신의 상태를 정상으로 판단했습니다.");
            this.print();
        } else System.out.println("잘못된 아기사자 정보입니다.");
    }
}