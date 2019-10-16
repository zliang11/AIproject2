import java.util.HashMap;
import java.util.Map;
public class Assignment {
    Variable variable = null;
    String assignedValue = null;
    Integer assignedNum = null;
    Object assignedObj = null;

    public Assignment(Variable var, String assignmentValue) {
        this.variable = var;
        this.assignedValue = assignmentValue;
        var.assignValue(assignmentValue);



//        Domain fake = new Domain();
//        Variable a = new Variable("a",fake);
//        this.assignmentMap.put(a,fake);
//
//        System.out.println(this.assignmentMap.toString());

    }

    public Assignment(Variable var, int assignmentValue) {
        this.variable = var;
        this.assignedNum = assignmentValue;
        var.assignNum(assignmentValue);
    }

    public Assignment(Variable var, Object assignmentValue) {
        this.variable = var;
        this.assignedObj = assignmentValue;
        // var.assignNum(assignmentValue);
    }

    public Variable getVariable(){
        return this.variable;
    }

    public int getAssignedNum(){
        return this.assignedNum;
    }

    public String getAssignedValue(){
        return this.assignedValue;
    }

//    public boolean checkComplete(CSP problem){
//        // if this.assignment is complete, return true;
//        // need to implement the completeness check against the problem;
//        return false;
//
//    }

//    public static boolean isComplete(CSP c) {
//
//        for(int i=0; i<c.var.length; i++) {
//            if(c.var[i].assign==null) {
//                return false;
//            }
//        }
//        return true;
//
//    }
//
//    public static boolean isComplete(CSP c, int value) {
//
//        for(int i=0; i<c.var.length; i++) {
//            if(c.var[i].value==0) {
//                return false;
//            }
//        }
//        return true;
//
//    }
//
//
//    public static boolean ConsistentMap(CSP c, int i, String value) {//c, position, domain
//        c.var[i].assign=value;//set assignment to this value (domain)
//        return isConsistentMap(c);
//    }
//
//    public static boolean ConsistentJob(CSP c, int i, int v) {//c, position, domain
//        c.var[i].value=v;//set assignment to this value (domain)
//        boolean consistent1 = isConsistentJob(c);
//        boolean consistent2 = isConsistentJob2(c);
//        if(consistent1==false) {
//            return false;
//        }
//        if(consistent2==false) {
//            return false;
//        }
//        else if(consistent1==true || consistent2==true){
//            return true;
//        }
//        return false;
//    }
//    //check consistent for Map
//
//    public static boolean ConsistentQueens(CSP c, int i, String value) {
//        c.var[i].assign=value;
//        return isConsistentQueens(c);
//    }
//
//    public static boolean isConsistentMap(CSP c) {
//
//        for(int i=0; i<c.cons1.size(); i++) {//go through all pairs of consistent
//            String city1= c.cons1.get(i);
//            String city2= c.cons2.get(i);
//
//            String ass1 = " ";
//            String ass2 = " ";
//
//            //when variable equals name of the consistent
//            //get the domain
//            for(int j=0; j<c.var.length; j++ ) {
//                if(c.var[j].name ==city1) {
//                    ass1 = c.var[j].assign;
//                }if(c.var[j].name == city2) {
//                    ass2 = c.var[j].assign;
//                }
//            }
//
//            //two adjacent cities have the same color
//            if(ass1!=null && ass1 == ass2) {
//                return false;
//            }
//
//        }
//        return true;
//
//    }
//
//    //check first consistent for job
//    public static boolean isConsistentJob(CSP c) {
//
//        for(int i=0; i<c.cons1.size(); i++) {
//            String leftside = c.cons1.get(i);
//            String rightside = c.cons2.get(i);
//            int inspection = 0;
//            int val1 = 0;
//            int val2 = 0;
//
//            for(int j=0; j<c.var.length; j++) {
//
//                if(c.var[j].name.equals("Inspect")) {
//                    inspection= c.var[j].value ;
//                }
//                if(c.var[j].name.equals(leftside)) {
//                    if(leftside.equals("AxleF") || leftside.equals("AxleB")) {
//                        val1 = c.var[j].value + 10;
//                    }if(leftside.equals("WheelRF") || leftside.equals("WheelLF")  || leftside.equals("WheelRB")  || leftside.equals("WheelLB") ) {
//                        val1 = c.var[j].value + 1;
//                    }if (leftside.equals("NutsRF") || leftside.equals("NutsLF")  || leftside.equals("NutsRB")  || leftside.equals("NutsLB") ) {
//                        val1 = c.var[j].value + 2;
//                    }else if(leftside.equals("CapsRF") || leftside.equals("CapsLF")  || leftside.equals("CapsRB")  || leftside.equals("CapsLB")) {
//                        val1 = c.var[j].value;
//                    }
//
//                }
//                if(c.var[j].name.equals(rightside)) {
//                    val2 = c.var[j].value;
//                }
//
//            }
//
//            if(( (val1 > val2) && val1!=0 && val2 !=0) ||  ( (val1 +1 >inspection) && val1!=0 && inspection!=0) ) {
//                return false;
//
//            }
//
//        }
//
//        return true;
//
//    }
//
//    //check second consistent for job
//    public static boolean isConsistentJob2(CSP c) {
//        for(int i=0; i<c.cons3.size(); i++) {
//            String dis1 = c.cons3.get(i);
//            String dis2 = c.cons4.get(i);
//            int val1=0;
//            int val2=0;
//            for(int j= 0; j<c.var.length; j++) {
//                if (c.var[j].name.equals(dis1)) {
//                    val1 = c.var[j].value;
//                }if(c.var[j].name.equals(dis2)) {
//                    val2 = c.var[j].value;
//                }
//            }
//            if(val1+10>val2 && val1!=0 && val2!=0) {
//                return false;
//            }
//
//        }
//
//        return true;
//
//
//    }
//
//
//    public static boolean isConsistentQueens(CSP c) {
//        int n = c.var.length;
//        if(n % 2 == 0 && n % 6 != 2){
//            for(int i = 0; i < n/2; i++){
//                if(c.var[i].assign != null){
//                    int q1 = Integer.parseInt(c.var[i].assign);
//                    if(q1!= 2*i+2){
//                        return false;
//                    }
//                }
//                if(c.var[n/2+i].assign != null){
//                    int q2 = Integer.parseInt(c.var[n/2+i].assign);
//                    if(q2!= 2*i+1){
//                        return false;
//                    }
//                }
//            }
//        }
//
//        else if(n % 2 == 0){
//            for (int i = 0; i < n / 2; i++) {
//                if (c.var[i].assign != null) {
//                    int q1 = Integer.parseInt(c.var[i].assign);
//                    if (q1 != 1 + ((2*i + n/2 - 1 )%n)){
//                        return false;
//                    }
//                }
//                if (c.var[n-i-1].assign != null) {
//                    int q2 = Integer.parseInt(c.var[n-i-1].assign);
//                    if (q2 != n-((2*i  + n/2 - 1 )%n)){
//                        return false;
//                    }
//                }
//            }
//        }
//        else{
//            for (int i = 0; i < (n - 1) / 2; i++) {
//                if (c.var[i].assign != null) {
//                    int q1 = Integer.parseInt(c.var[i].assign);
//                    if (q1 != ((2*i + (n - 1) / 2 - 1) % (n - 1)) +1 ) {
//                        return false;
//                    }
//                }
//                if (c.var[(n-1)-i-1].assign != null) {
//                    int q2 = Integer.parseInt(c.var[(n - 1) - i - 1].assign);
//                    if (q2 != (n-1) - ((2 * i + (n - 1) / 2 - 1) % (n - 1))) {
//                        return false;
//                    }
//                }
//            }
//            if(c.var[n-1].assign != null){
//                int q2 = Integer.parseInt(c.var[(n - 1)].assign);
//                if(q2 != n){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


}
