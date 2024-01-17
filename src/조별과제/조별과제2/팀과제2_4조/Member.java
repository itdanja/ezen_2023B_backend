package 조별과제.조별과제2.팀과제2_4조;

public class Member {

    static int count = 0;

    String id;
    String pw;
    String name;
    String rrn;
    String phone;
    int memberNum;

    Member(String id, String pw, String name, String rrn, String phone){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.rrn = rrn;
        this.phone = phone;
        this.memberNum = count;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", rrn='" + rrn + '\'' +
                ", phone='" + phone + '\'' +
                ", memberNum=" + memberNum +
                '}';
    }
}
