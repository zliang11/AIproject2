public abstract class Variable {
    private String variableName;
    private Domain domain;
    private String assignedValue = null;
    private Integer assignedNum = null;
    // this should most likely be abstract class

    public Variable(String varName, Domain dom){
        this.variableName = varName;
        this.domain = dom;
    }

    public String toString(){
        return this.variableName;
    }

    public Domain getDomain(){
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

    public abstract Domain changeDomain();
    //this is for when inference happens, domain of the variable changes/altered

    public abstract Object assignValue();
    //this object thing might be absurb.

}
