

public abstract class Constraint {
    protected ConstraintType constraintType;
    protected Variable var1;
    protected Variable var2;
    protected ArrayListSet variablesInvolved;

//    public Constraint(Variable var1, Variable var2, ConstraintType type){
//        this.constraintType = type;
//        this.var1 = var1;
//        this.var2 = var2;
//        this.variablesInvolved.add(var1);
//        this.variablesInvolved.add(var2);
////        this.variablesInvolved = variables;
//
//    }
    public String toString(){
        String result="";
        for (int i=0; i<this.variablesInvolved.size(); i++){
            result = result + " "+this.variablesInvolved.get(i);
        }
        result = result + " "+this.constraintType;
        return result;

    }

}
