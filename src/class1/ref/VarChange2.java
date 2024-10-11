package class1.ref;

public class VarChange2 {

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("data A : " + dataA);
        //dataA 참조값
        System.out.println("data B : " + dataB);
        //dataA 참조값
        System.out.println("data A : " + dataA.value);
        //10
        System.out.println("data B : " + dataB.value);
        //10


        dataA.value = 20 ;
        System.out.println("data A : " + dataA.value);
        //20
        System.out.println("data B : " + dataB.value);
        //20

        dataB.value = 30;
        System.out.println("data A : " + dataA.value);
        //30
        System.out.println("data B : " + dataB.value);
        //30

    }
}
