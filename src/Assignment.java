import java.util.HashMap;
import java.util.Map;
public class Assignment {
//    Variable var;
//    Domain assigned_value;
    Map<Variable,Domain> assignmentMap;

//    public Assignment(Variable varName, Domain value){
//        this.var = varName;
//        this.assigned_value = value;
//    }
    public Assignment() {
        this.assignmentMap = new HashMap<>();

        Domain fake = new Domain();
        Variable a = new Variable("a",fake);
        this.assignmentMap.put(a,fake);

        System.out.println(this.assignmentMap.toString());

    }
    public static void main(String[] args) {
        Assignment test = new Assignment();
    }
}
