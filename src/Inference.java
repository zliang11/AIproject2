import java.util.LinkedList;
import java.util.Queue;

public class Inference {
    public Inference(){
        // inference is AS3

    }

    public Assignment toAssignment() {
        return null;

    }

    public boolean failure() {
        return false;

    }
    public Boolean AC3( CSP problem){

        Queue allArcs = problem.getArc();
        // this functions needs to return a queue

        while (!allArcs.isEmpty()){
            tuple pair = removeFirst(allArcs);
            if revise(problem, pair[1], pair[2]){
                if (pair[1].getDomain().size() ==0 ){
                    return false;
                }

            }
        }
        return true;

    }
}
