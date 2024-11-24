package construct;

import java.util.ArrayList;
import java.util.List;

public class MethodInitMain3 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("찬", 15, 80);

        MemberInit member2 = new MemberInit();
        member2.initMember("영", 17, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
//        List<MemberInit> members = new ArrayList<>();
//        members.add(member1);
//        members.add(member2);

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }

}
