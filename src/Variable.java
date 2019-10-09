public abstract class Variable {
    private String variableName;
    private Domain domain;
    private Object assignedValue;
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
    public abstract Domain changeDomain();
    //this is for when inference happens, domain of the variable changes/altered

    public abstract Object assignValue();
    //this object thing might be absurb.

}
