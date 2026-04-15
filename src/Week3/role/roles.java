package Week3.role;
import Week3.policy.policy;

public abstract class roles { // 1-1.
    private String name;
    private String major;
    private int generation;
    private String part;

    public roles(String name, String major, int generation, String part){
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }
    public String getName(){ return name; }
    public String getMajor(){ return major; }
    public int getGeneration(){ return generation; }
    public String getPart(){ return part; }

    public boolean getSubmit(){
        policy policy = getPolicySubmit();
        boolean result = policy.canSubmit();
        return result;
    }

    public abstract policy getPolicySubmit();
    public abstract void DisplayInfo();
}
