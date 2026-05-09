package package2;

import role.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    List<Role> Save = new ArrayList<>();
    Map<String, Role> nameMap = new HashMap<>();

    @Override
    public void SaveMember(Role member) {
        Save.add(member);
    }

    @Override
    public Role SearchName(String name) {
        for (int i = 0; i < Save.size(); i++) {
            Role current = Save.get(i);
            if (current.getName().equals(name)) return current;
        }
        return null;
    }

    @Override
    public List<Role> LookupAll() { return Save; }

    @Override
    public boolean NameDuplication(String name) {
        if(nameMap.containsKey(name)) return true;
        return false;
    }
}
