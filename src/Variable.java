public class Variable {
    String variableName;
    Domain domain;
    // this should most likely be abstract class

    public Variable(String varName, Domain dom){
        this.variableName = varName;
        this.domain = dom;

    }

    public String toString(){
        return this.variableName;
    }

}
