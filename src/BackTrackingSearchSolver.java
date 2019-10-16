import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class BackTrackingSearchSolver {
    ArrayListSet<Assignment> assignments;

    public BackTrackingSearchSolver() {
        this.assignments = new ArrayListSet<Assignment>();

    }

    public ArrayListSet Backtracking_Search(CSP problem) {

        ArrayListSet<Assignment> test = new ArrayListSet<>();
        // placeholder only

        return Backtrack(test, problem);
    }

    public ArrayListSet Backtrack(ArrayListSet<Assignment> assignments, CSP problem) {
        //this assignment input should be from the CSP problem's assignment.

        if (AssignmentComplete(assignments, problem.getVariables())) {
            return assignments;
        }
        // picking unselected variable to do new assignment
        //the problem itself keeps track of assignment,

        Variable var = problem.selectUnassignedVar();

//        if (assign.complete()) {
//            return assign;
//        }
        ArrayListSet<Assignment> test = new ArrayListSet<>();        // placeholder only

        return test;

    }

    public boolean AssignmentComplete(ArrayListSet<Assignment> assignments, ArrayListSet variables) {
        List<Variable> allVariablesAssigned = new ArrayList<>();
        //making a list of variables that have assigned a value
        for(Assignment assign: assignments){
            allVariablesAssigned.add(assign.getVariable());
        }
        //if all variables have been assigned, then the assignment list complete. if not, then no

        for(int i=0; i< variables.size(); i++){
            if (!allVariablesAssigned.contains(variables.get(i))){
                return false;
            }
        }
        return true;
    }


    // AC3 algorithm
    public boolean AC3(CSP problem, ArrayListSet variables, Domain domain, Constraint constraint) {
        Queue<Tuple> queue = new LinkedList<>();
        // add arcs to queue

        for (Variable  : problem.getVariables())
        while(!queue.isEmpty()) {
            queue.remove();
            if Revise(problem, Xi, Xj) {
                // inconsistency found
                if (size of Domain i == 0){
                    return false;
                }
                for (each Xk : Xi neighbors){
                    queue.add((Xk, Xi));
                }
            }
        }
        return true;
    }

    // Revise function for AC3 algorithm
    public boolean Revise(CSP problem, Variable Xi, Variable Xj){
        boolean revised = false;
        for (Object x : Xi.getDomain().getAllowedValues()){
            if (no value y in Dj allows (x,y) to satisfy the constraint between Xi and Xj){

            }

            revised = true;
        }
        return revised;
    }
}
