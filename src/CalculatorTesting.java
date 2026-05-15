public class CalculatorTesting {
    public static void main(String[] args) {
        //test case 1
        Calculator c = new Calculator();
        Calculator c2 = new Calculator(1, 2, "+");
        System.out.println(c);
        System.out.println(c2);

        //test case 2
        c.setMem1(5);
        c.setMem2(7);
        c.setOp("+");
        System.out.println(c);
        System.out.println(c.perform());

        //test case 3
        c.swap();
        c.setOp("-");
        System.out.println(c);
        System.out.println(c.perform());


        //test case 4
        c.setOp("*");
        System.out.println(c.perform());

        //test case 5
        c.swap();
        c.setOp("/");
        System.out.println(c);
        System.out.println(c.perform());

        //test case 6
        System.out.println(c);
        System.out.println("mem2 is " + c.getMem2());

        //test case 7
        System.out.println(c.performDiv());

        //test case 8
        c.setMem2(0);
        System.out.println(c.perform());
        System.out.println(c);
    }
}
