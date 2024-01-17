package 조별과제.조별과제2.팀과제2_4조;

public class Service {

    // 필드
    int memberNum;  // 고객고유 번호
    String rating;  // 등급
    double volume;  // 용량 10.0 , 20,0 30,0
    String period; // 30일
    int price;  // 5000 , 10000 ,15000

    // 메소드


    @Override
    public String toString() {
        return "Service{" +
                "memberNum=" + memberNum +
                ", rating='" + rating + '\'' +
                ", volume=" + volume +
                ", period='" + period + '\'' +
                ", price=" + price +
                '}';
    }

    void basic(int memberNum){
        this.memberNum = memberNum;
        this.rating = "Basic";
        this.volume = 10.0;
        this.period = "30";
        this.price = 5000;
    }
    void standard(int memberNum){
        this.memberNum = memberNum;
        this.rating = "standard";
        this.volume = 20.0;
        this.period = "30";
        this.price = 10000;
    }
    void premium(int memberNum){
        this.memberNum = memberNum;
        this.rating = "premium";
        this.volume = 30.0;
        this.period = "30";
        this.price = 15000;
    }
}
