import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class CSP {
    ArrayListSet<Variable> variables;
    ArrayListSet<Constraint> constraints;
    ArrayListSet<Domain> domains;
    ArrayListSet<Assignment> assignments;

    public CSP(){
        this.assignments = new ArrayListSet<>();
    }

    public Variable selectUnassignedVar() {
        List<Variable> allVariablesAssigned = new ArrayList<>();
        //making a list of variables that have assigned a value
        for(Assignment assign: this.assignments){
            allVariablesAssigned.add(assign.getVariable());
        }

        for(int i=0; i< variables.size(); i++){
            if (!allVariablesAssigned.contains(variables.get(i))){
                return variables.get(i);
            }
        }
        //picking the variable that has not been assigned yet.
        return null;

    }
    public ArrayListSet getVariables(){
        return this.variables;
    }
    public void PrintConstraints(){
        for (Constraint con: this.constraints){
            System.out.println(con);
        }
    }
    public void PrintVariable(){
        for (Variable var:variables){
            System.out.println(var + " " + var.getDomain().toString());
        }
    }

    public boolean addAssignment(Assignment new_Assign){
        return this.assignments.add(new_Assign);
    }

//    public Domain getDomainValues(Variable var, Assignment assign, CSP problem){
////        return var.domain;
//
//    };






}
