abstract class CSP {
    ArrayListSet<Variable> variables;
    ArrayListSet<Constraint> constraints;
    ArrayListSet<Assignment> assignments;

    public CSP(){
    }

    public Variable selectUnassignedVar(Assignment assign) {
        for ( Variable var: variables) {
            if (!assign.getAssignmentMap().keySet().contains(var)){
                return var;
            }
        }
        return null;
    }

    public Domain getDomainValues(Variable var, Assignment assign, CSP problem){
        return var.domain;

    };






}
