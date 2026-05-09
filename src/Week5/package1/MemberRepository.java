package package1;

import role.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MemberRepository {
    List<Role> Save = new ArrayList<>();
    Map<String, Role> nameMap = new HashMap<>();

    public void SaveMember(Role member) {
        Save.add(member);
    }

    public Role SearchName(String name) {
        for (int i = 0; i < Save.size(); i++) {
            Role current = Save.get(i);
            if (current.getName().equals(name)) return current;
        }
        return null;
    }

    public List<Role> LookupAll() { return Save; }

    public boolean NameDuplication(String name) {
        if(nameMap.containsKey(name)) return true;
        return false;
    }
}
