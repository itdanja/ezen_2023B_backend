package day22;

public class Step3 {

    public static void main(String[] args) {

        // 1. 대리점 객체 생성
        HomeAgency 상록수대리점 = new HomeAgency();
        // Rentable<Home> 상록수대리점 = new HomeAgency();
        // 2. 렌탈 요청
        Home home = 상록수대리점.rent();  // 반환 :  new home()
        // 3. 렌탈된 객체 이벤트 실행
        home.turnOnLight(); //  new home().turnOnLight()

        // 1. 대리점 객체 생성
        CarAgency 중앙대리점 = new CarAgency();
        // 2. 렌탈 요청
        Car2 car2 = 중앙대리점.rent(); // 반환 : new Car2()
        // 3. 렌탈된 객체 이벤트 실행
        car2.run(); // new Car2().run()
    }
}
