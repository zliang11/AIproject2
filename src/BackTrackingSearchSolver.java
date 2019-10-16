import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

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

        if (AssignmentComplete(assignments, problem.getVariables())) {
            return assignments;
        }
        // picking unselected variable to do new assignment
        //the problem itself keeps track of assignment,

        Variable var = problem.selectUnassignedVar();
        if( var != null){
            for( int i=0; i< var.getDomain().getAllowedValues().size(); i++){
                
                
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
        while(!queue.isEmpty()){
            Tuple t = queue.poll();
            Variable Xi = t.getI();
            Variable Xj = t.getJ();
            if (Revise(problem, Xi, Xj)){
                if (Xi.getDomain().getAllowedValues().isEmpty()){
                    return false;
                }
                for (Variable Xk : Xi.getNeighbors()){
                    queue.add(new Tuple (Xk, Xi));
                }
            }
        }
        return true;
    }

    // Revise function for AC3 algorithm
    public boolean Revise(CSP problem, Variable Xi, Variable Xj){
        boolean revised = false;
        for (Object v : Xi.getDomain().getAllowedValues()){
            if (){
                Xi.getDomain().getAllowedValues().remove(Xi);
                revised = true;
            }
        }
        return revised;
    }
}

    // Revise function for AC3 algorithm
    public boolean Revise(CSP problem, Variable Xi, Variable Xj){
        boolean revised = false;
        for (domain : problem.getDomainValues(Xi)){

        }

        return revised;
    }
}
