package Week3.role;
import Week3.policy.policy;
import Week3.policy.LionPolicy;


public class Lion extends roles{
    int id;

    public Lion(String name, String major, int generation, String part, int id){
        super(name, major, generation, part);
        this.id = id;

    }

    public int getId() { return id; }

    @Override
    public policy getPolicySubmit(){
        return new LionPolicy();
    }

    @Override
    public void DisplayInfo(){
        System.out.println("역할: 아기사자");
        System.out.println("이름: "+getName()+" | 전공: "+getMajor()+" | 기수: "+getGeneration()+" | 파트: "+getPart());
        System.out.println("학번: "+getId());
        System.out.print("과제 제출 가능 여부: ");
        if(getSubmit()) System.out.println("가능");
        else System.out.println("불가능");
        System.out.println("---------------------------");
    }
}
