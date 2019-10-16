import java.util.HashMap;
import java.util.Map;
public class Assignment {
    Variable variable = null;
    String assignedValue = null;
    Integer assignedNum = null;
    Object assignedObj = null;

    public Assignment(Variable var, String assignmentValue) {
        this.variable = var;
        this.assignedValue = assignmentValue;
        var.assignValue(assignmentValue);



//        Domain fake = new Domain();
//        Variable a = new Variable("a",fake);
//        this.assignmentMap.put(a,fake);
//
//        System.out.println(this.assignmentMap.toString());

    }

    public Assignment(Variable var, int assignmentValue) {
        this.variable = var;
        this.assignedNum = assignmentValue;
        var.assignNum(assignmentValue);
    }

    public Assignment(Variable var, Object assignmentValue) {
        this.variable = var;
        this.assignedObj = assignmentValue;
        // var.assignNum(assignmentValue);
    }

    public Variable getVariable(){
        return this.variable;
    }

    public int getAssignedNum(){
        return this.assignedNum;
    }

    public String getAssignedValue(){
        return this.assignedValue;
    }

//    public boolean checkComplete(CSP problem){
//        // if this.assignment is complete, return true;
//        // need to implement the completeness check against the problem;
//        return false;
//
//    }


}
