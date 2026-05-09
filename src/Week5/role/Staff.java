package role;

import policy.SubmissionPolicy;
import policy.StaffSubmissionPolicy;

public class Staff extends Role{
    String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;

    }

    public String getPosition(){
        return position;
    }

    @Override
    public SubmissionPolicy getPolicySubmit(){
        return new StaffSubmissionPolicy();
    }

    @Override
    public void DisplayInfo(){
        System.out.println("역할: 운영진");
        System.out.println("이름: "+getName()+" | 전공: "+getMajor()+" | 기수: "+getGeneration()+" | 파트: "+getPart());
        System.out.println("직책: "+getPosition());
        System.out.print("과제 제출 가능 여부: ");
        if(getSubmit()) System.out.println("가능");
        else System.out.println("불가능");
        System.out.println("---------------------------");
    }
}