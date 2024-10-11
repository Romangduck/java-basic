package class1.ref;

import class1.Student;

public class VarChange1 {

    public static void main(String[] args) {
        int a =10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //본인의 값만 변경됨

    }
}
