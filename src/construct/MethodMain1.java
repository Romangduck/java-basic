package construct;

public class MethodMain1 {
    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        memberInit.initMember("학생1",10,20);
        System.out.println(memberInit.name + memberInit.grade + memberInit.age);
    }
}
