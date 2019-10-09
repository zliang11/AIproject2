public abstract class CSP {
    ArrayListSet<Variable> variables;
    ArrayListSet<Constraint> constraints;
    ArrayListSet<Domain> domains;
    ArrayListSet<Assignment> assignments;

    public CSP(){
        this.assignments = new ArrayListSet<>();
    }

    public Variable selectUnassignedVar(Assignment assign) {
//        for ( Variable var: variables) {
//            if (!assign.getAssignmentMap().keySet().contains(var)){
//                return var;
//            }
//        }
        return null;
    }
    public void PrintVariable(){
        for (Variable var:variables){
            System.out.println(var + " " + var.getDomain().toString());
        }
    }

    public boolean addAssignment(Assignment new_Assign){
        return this.assignments.add(new_Assign);
    }

//    public Domain getDomainValues(Variable var, Assignment assign, CSP problem){
////        return var.domain;
//
//    };






}
