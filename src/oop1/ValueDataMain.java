package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.value++;

        add(valueData);
        add(valueData);
        add(valueData);

        System.out.println(valueData.value);


    }

    static void add(ValueData valueData) {
        valueData.value++;
    }
}
