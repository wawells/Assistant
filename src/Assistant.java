import java.util.ArrayList;

public class Assistant {

    
    //private String DOB;
    
    int age; //days
    
    private String name;
    private String activationWord;
    
    
    private ArrayList<String> controlled; //MAC addresses of controlled network devices
    
    public Assistant (String name) {
        this(name, 30);
    }
    
    public Assistant (String name, int age) {
        
        this.age = age;
        this.name = name;
    }
    
    
    public int getAge() {
        
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    public String output(String query) {
        return null; //TODO
    }
    
}
