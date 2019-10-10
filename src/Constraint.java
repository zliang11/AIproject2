

public abstract class Constraint {
    protected ConstraintType constraintType;
    protected ArrayListSet variablesInvolved;

    public Constraint(ArrayListSet variables, ConstraintType type){
        this.constraintType = type;
        this.variablesInvolved = variables;

    }
    public String toString(){
        String result="";
        for (int i=0; i<this.variablesInvolved.size(); i++){
            result = result + " "+this.variablesInvolved.get(i);
        }
        result = result + " "+this.constraintType;
        return result;

    }

}
