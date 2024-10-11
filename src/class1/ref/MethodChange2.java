package class1.ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("data A = " + dataA.value);

        changeReference(dataA);
        System.out.println("data A = " + dataA.value);

    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
