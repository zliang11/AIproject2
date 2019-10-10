import java.util.HashMap;
import java.util.Map;
public class Assignment {
    Variable variable = null;
    Object assignedValue = null;

    public Assignment(Variable var, Object assignmentValue) {
        this.variable = var;
        this.assignedValue = assignmentValue;


//        Domain fake = new Domain();
//        Variable a = new Variable("a",fake);
//        this.assignmentMap.put(a,fake);
//
//        System.out.println(this.assignmentMap.toString());

    }
    public Variable getVariable(){
        return this.variable;
    }
//    public boolean checkComplete(CSP problem){
//        // if this.assignment is complete, return true;
//        // need to implement the completeness check against the problem;
//        return false;
//
//    }
//    public Assignment addAssignment(Variable var, Domain dom) {
//        this.assignmentMap.put(var,dom);
//        return this;
//    }
//    public Assignment removeAssignment(Variable var){
//        this.assignmentMap.remove(var);
//        return this;
//    }
//    public Map<Variable, Domain> getAssignmentMap() {
//        return this.assignmentMap;
//    }
//
//
//    public static void main(String[] args) {
//        Assignment test = new Assignment();
//    }
}
