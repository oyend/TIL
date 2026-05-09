package package2;

import role.Role;

import java.util.List;

public class MemberService {
    final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public void Register(Role member){
        Role found = memberRepository.SearchName(member.getName());
        if(memberRepository.NameDuplication(member.getName())) System.out.println("등록 실패: 이미 존재하는 이름입니다.\n");
        else {
            memberRepository.SaveMember(member);
            System.out.println("등록 완료: " + member.getName());
        }
    }

    public Role Search(String name) {
        return memberRepository.SearchName(name);
    }

    public List<Role> FindAll() {
        return memberRepository.LookupAll();
    }
}
