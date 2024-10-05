package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String [] stdName = {"학생1","학생2","학생3"};
        int [] stdAges = {15,20,30};
        int [] stdGrades = {25,40,35};

        for(int i=0; i<stdName.length; i++) {
            System.out.println(" 이름: " + stdName[i] + " 나이: " + stdAges[i] + " 성적: " + stdGrades[i]);
        }

    }
}
