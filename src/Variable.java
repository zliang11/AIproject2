public class Variable {
    String variableName;
    Domain domain;

    public Variable(String varName, Domain dom){
        this.variableName = varName;
        this.domain = dom;

    }

    public String toString(){
        return this.variableName;
    }

}
