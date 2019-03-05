import java.util.*;

public class User {
    String fName;
    String lName;
    String email;
    public double targetAdherance;

    public User (String fName, String lName, String email, double targetAdherance){
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.targetAdherance = targetAdherance;
    }
}
