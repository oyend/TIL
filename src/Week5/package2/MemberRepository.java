package package2;

import role.Role;

import java.util.List;

public interface MemberRepository {
    public void SaveMember(Role member);
    public Role SearchName(String name);
    public List<Role> LookupAll();
    public boolean NameDuplication(String name);
}
