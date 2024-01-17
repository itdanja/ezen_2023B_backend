package 조별과제.조별과제2.팀과제2_3조.팀과제2;

public class MemberInfo {

    int no;
    String name;
    String id;
    String pw;
    String num;
    String birth;

    String 서비스 = "";
    int month;
    int price;
    MemberInfo(){}
    public MemberInfo(int no,
                      String name,
                      String id,
                      String pw,
                      String num,
                      String birth,
                      String 서비스,
                      int month,
                      int price) {
        this.no = no;
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.num = num;
        this.birth = birth;
        this.서비스 = 서비스;
        this.month = month;
        this.price = price;
    }


}
