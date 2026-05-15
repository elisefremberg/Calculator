//Name: e.g. Elise Fremberg
//Computing ID: kae6ja@virginia.edu
//Homework Name: HW 2 - Calculator
//Resources used (if applicable): None

public class Calculator {
    //declaring the attributes
    private int mem1;
    private int mem2;
    private String op;

    //default constructor: sets all attributes to default values
    public Calculator() {
        mem1 = 0;
        mem2 = 0;
        op = " ";
    }

    //overloaded constructor: assign attributes with the associated values
    //don't need to validate mem1 and mem2 because they just need to be ints
    public Calculator(int op1, int op2, String newOp) {
        setMem1(op1);
        setMem2(op2);
        if (newOp.equals("+") || newOp.equals("-") || newOp.equals("*") || newOp.equals("/") || newOp.equals("^")) {
            setOp(newOp);
        }
        else{
            op = " ";
        }
    }

    //accessor for mem1
    public int getMem1() {
        return mem1;
    }

    //accessor for mem2
    public int getMem2() {
        return mem2;
    }

    //accessor for op
    public String getOp() {
        return op;
    }

    //mutator for mem1
    //don't need to validate mem1 and mem2 because they just need to be ints
    public void setMem1(int op1) {
        mem1 = op1;
    }

    //mutator for mem2
    public void setMem2(int op2) {
        mem2 = op2;
    }

    //mutator for op and validating that it is a valid operator
    public void setOp(String newOp) {
        if (newOp.equals("+") || newOp.equals("-") || newOp.equals("*") || newOp.equals("/") || newOp.equals("^")) {
            op = newOp;
        }
    }

    //returns a string so we can print the actual data and not the memory address
    @Override
    public String toString(){
        String result = "";
        result += mem1 + " " + op + " " + mem2;
        return result;
    }

    //identifies what the operator is and then performs the calculation
    public int perform(){
        //create variable to return the answer to the calculation
        int result = 0;

        //figures out what the operator is and then preforms it on mem1 and mem2
        if (op.equals("+")) {
            result = mem1 + mem2;
        }
        else if (op.equals("-")) {
            result = mem1 - mem2;
        }
        else if (op.equals("*")) {
            result = mem1 * mem2;
        }
        else if (op.equals("/")) {
            //if mem2 does not equal 0, then go ahead and perform the division
            if (mem2 != 0) {
                result = mem1 / mem2;
            }
            //else, mem2 does equal 0 then return 0
            else{
                return 0;
            }
            }
        else if (op.equals("^")) {
            //set result to 1 because if it wa still 0 everytime we multiplied it would stay 0
            result = 1;
            for (int i = 0; i < mem2; i++) {
                result *= mem1;
            }
    }
        //updates mem2 to equal the result
        mem2 = result;
        return result;
    }

    //method to perform double division on mem1 and mem2
    public double performDiv(){
        double result = 0.0;

        //making new variables that are mem1 and mem2 but doubles so we can do double division without dropping any decimal points
        double doubleMem1 = (double) mem1;
        double doubleMem2 = (double) mem2;

        //checks if operator is / and make sure mem 2 is not 0
        if (op.equals("/") && mem2 != 0){
            result = doubleMem1 / doubleMem2;
        }
        else{
            return 0.0;
        }
        return result;
    }

    //method to swap mem1 and mem2
    public void swap(){
        //temp variable to hold mem1 as we assign mem1 to mem 2
        int temp = mem1;
        mem1 = mem2;
        //now we can set mem2 to the temp variable to assign it the original value of mem1
        mem2 = temp;
    }
}
