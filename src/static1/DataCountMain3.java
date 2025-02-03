package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("a");
        System.out.println("a = " + Data3.count);
        Data3 data2 = new Data3("b");
        System.out.println("b = " + Data3.count);
        Data3 data3 = new Data3("c");
        System.out.println("c = " + Data3.count);
    }

}
