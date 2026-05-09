package package2;

import role.Lion;
import role.Role;
import role.Staff;

import java.util.ArrayList;
import java.util.List;

public class MockMemberRepository implements MemberRepository {
    @Override
    public void SaveMember(Role member) {
        System.out.println("멤버 저장");
    }

    @Override
    public Role SearchName(String name) {
        System.out.println("이름 검색");
        return new Staff("더미", "더미", 0, "더미","더미");
    }

    @Override
    public List<Role> LookupAll() {
        System.out.println("멤버 조회");
        List<Role> dummy = new ArrayList<>();
        dummy.add(new Lion("더미1", "더미", 0, "더미",202500000));
        dummy.add(new Staff("더미2", "더미", 0, "더미","더미"));
        return dummy;
    }

    @Override
    public boolean NameDuplication(String name) {
        if("더미".equals(name)) return true;
        return false;
    }
}
