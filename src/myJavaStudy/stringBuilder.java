package myJavaStudy;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("연결");
//        String str = stringBuilder;   // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
        String str = stringBuilder.toString();
        // 두 println()은 같은 값을 출력한다
        System.out.println(stringBuilder);
        System.out.println(str);
        main2(args);
    }

    public static void main2(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        list.add("첫 번째, ");
        list.add("두 번째, ");
        list.add("세 번째, ");
        list.add("네 번째, ");
        list.add("다섯 번째");

        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        System.out.println(stringBuilder);
    }



}