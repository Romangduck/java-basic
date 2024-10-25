package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member = new MemberConstruct("user1", 15 );
        MemberConstruct member2 = new MemberConstruct("user2",20,30);

        MemberConstruct[] memberConstructs = {member,member2};

        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println("name =" + memberConstruct.name + ", age :" + memberConstruct.age + " , grade :" + memberConstruct.grade);
        }

    }
}
