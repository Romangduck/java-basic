package class1;


public class ClassStart5 {

    public static void main(String[] args) {

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 20;
        student1.grade = 80;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 25;
        student2.grade = 100;

        Student[] students = new Student[]{student1,student2};

        for(int i=0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade );
        }

        for(int i=0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }

        for(Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }

        System.out.println(students[0].name);
        System.out.println(students[1].name);
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade );
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade );
    }
}