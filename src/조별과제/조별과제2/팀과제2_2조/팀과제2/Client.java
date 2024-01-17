package 조별과제.조별과제2.팀과제2_2조.팀과제2;

public class Client {
    String id;
    String pw;
    int 구독기간;
    String 서비스형태;

    Client(String id, String pw){
        this.id=id;
        this.pw=pw;
    }

    @Override
    public String toString() {
        return  "id='" + id + "\'\n" +
                "구독기간=" + 구독기간 +"\n"+
                "서비스형태='" + 서비스형태 + "\'";
    }
}
