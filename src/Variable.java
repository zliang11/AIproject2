
import java.util.List;

public class Variable {
    private String variableName;
    private ArrayListSet domain;
    private String assignedValue = null;
    private Integer assignedNum = null;
    private List<Variable> neighbors;
    // this should most likely be abstract class

    public Variable(String varName, ArrayListSet dom, List<Variable> nb){
        this.variableName = varName;
        this.domain = dom;
        this.neighbors = nb;
    }

    public String getAssignedValue(){
        return this.assignedValue;
    }
    public Integer getAssignedNum(){
        return this.assignedNum;
    }

    public String toString(){
        return this.variableName;
    }

    public ArrayListSet getDomain(){
        return this.domain;
    }

    public String assignValue(String val){
        this.assignedValue = val;
        this.assignedNum = null;
        return this.assignedValue;
    }
    public Integer assignNum(Integer num){
        this.assignedNum = num;
        this.assignedValue = null;
        return this.assignedNum;
    }

    public Boolean valueAssigned(){
        if (this.assignedNum == null && this.assignedValue == null){
            return false;
        }
        return true;
    }

//    public abstract Domain changeDomain();
//    //this is for when inference happens, domain of the variable changes/altered
//
//    public abstract Object assignValue();
//    //this object thing might be absurb.
    public List getNeighbors(){
        return this.neighbors;
    }


}
