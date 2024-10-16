package class1.ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
//        data = new Data();
        data.value = 10;
        System.out.println(data.value);
    }
}
