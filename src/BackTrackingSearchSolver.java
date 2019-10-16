import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class BackTrackingSearchSolver {
    ArrayListSet<Assignment> assignments;
    // keeping track of all assignments

    Integer problemNumber = null;
    // 1 = Australia Map
    // 2 = Job
    // 3 = nQueen
    // 4 = AC3 demo
    // 5 = Mackworth


    public BackTrackingSearchSolver(int problemNumber) {
        this.assignments = new ArrayListSet<Assignment>();
        this.problemNumber = problemNumber;

    }

    public ArrayListSet Backtracking_Search(CSP problem) {

        ArrayListSet<Assignment> test = new ArrayListSet<>();
        // placeholder only

        return Backtrack(test, problem);
    }

    public ArrayListSet Backtrack(ArrayListSet<Assignment> assignments, CSP problem) {
        //this assignment input should be from the CSP problem's assignment.

        if (AssignmentComplete(problem.getVariables())) {
            return assignments;
        }
        // picking unselected variable to do new assignment
        //the problem itself keeps track of assignment,

        Variable var = problem.selectUnassignedVar();

        if( var != null){
            for( int i=0; i< var.getDomain().getAllowedValues().size(); i++){

                switch (this.problemNumber) {
                    case 1:
                        if (conssistentWithMap(var.getDomain().getAllowedValues().get(i) )){
                            assignments.add(new Assignment(var, var.getDomain().getAllowedValues().get(i) ));
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:





                }
                
                
                if (consistentWithAssignment( var.getDomain().getAllowedValues().get(i) )){
                    assignments.add(new Assignment(var, var.getDomain().getAllowedValues().get(i) ));
                    
                    Inference newInference = inference(problem, var, var.getDomain().getAllowedValues().get(i));
                    // this inferencing needs implementation.

                    if (! newInference.failure()) {
                        assignments.add(newInference.toAssignment());
                        ArrayListSet result = Backtrack(assignments, problem);
                        if(!result.failure()){
                            return result;
                        }
                    }
                    
                }
                // two lines of removal not added bc confused.
            }
            return null;
        }

//        if (assign.complete()) {
//            return assign;
//        }
        ArrayListSet<Assignment> test = new ArrayListSet<>();        // placeholder only

        return test;

    }

    private Inference inference(CSP problem, Variable var, Object o) {
    }

    private boolean consistentWithAssignment(Object o) {
        return false;
    }

    // done
    public boolean AssignmentComplete( ArrayListSet<Variable> variables) {

        for (int i = 0; i < variables.size(); i++) {
            if (variables.get(i).valueAssigned() == false) {
                return false;
            }
        }
        return true;

    }

    // AC3 algorithm
    public boolean AC3(CSP problem, ArrayListSet variables, Domain domain, Constraint constraint) {
        Queue<Variable> queue = new LinkedList<Variable>();
        // add arcs to queue
//        for ( : problem.getVariables())
//        while(!queue.isEmpty()){
//            queue.pop();
//            if Revise(problem, Xi, Xj){
//
//            }
//        }
        return true;
    }

    // Revise function for AC3 algorithm
    public boolean Revise(CSP problem, Variable Xi, Variable Xj){
        boolean revised = false;
        for (domain : problem.getDomainValues(Xi)){

        }

        return revised;
    }
}
