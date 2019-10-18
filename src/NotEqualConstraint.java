public class NotEqualConstraint extends Constraint {


    public NotEqualConstraint(Variable var1, Variable var2) {
        this.var1 = var1;
        this.var2 = var2;

    }
}
//
//    public boolean constraintValidCheck(Assignment assign, Variable setVar, Domain setValue){
//
//        if(assign.getAssignmentMap().keySet().contains(this.var1) && assign.getAssignmentMap().keySet().contains(this.var2) ){
//            if(assign.getAssignmentMap().get(this.var1) == assign.getAssignmentMap().get(this.var2) ){
//                return false;
//            }
//        }
//
//        if (setVar.equals(this.var1)) {
//            if(! assign.getAssignmentMap().keySet().contains(this.var2)){
//                return true;
//            } else {
//                if(assign.getAssignmentMap().get(this.var2).equals(setValue)){
//                    return false;
//                } else {
//                    return true;
//                }
//            }
//
//        } else if (setVar.equals(this.var2)){
//            if(! assign.getAssignmentMap().keySet().contains(this.var1)){
//                return true;
//            } else {
//                if(assign.getAssignmentMap().get(this.var1).equals(setValue)){
//                    return false;
//                } else {
//                    return true;
//                }
//            }
//
//
//        }else {
//            return true;
//            //the variables of this constraint are not involved in the new assignment set.
//        }
//
//
//    }
//}
