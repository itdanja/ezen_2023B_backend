package day15;

public class Step1 {
    public static void main(String[] args) {
         // 1. (운전자)객체 생성
        Driver driver1 = new Driver();      // 1명
            Driver driver2 = new Driver(); // 1명
        // 2. 객체 생성
        Bus bus = new Bus();
        driver1.drive( bus );   // 버스 운전
        // 3. 객체 생성
        Taxi taxi = new Taxi();
        driver1.drive( taxi ); // 택시로 변경

        driver2.drive( taxi );  // 운전자1 택시 운행
        driver1.drive( taxi );  // 운전자2 택시 운행


    } // main e
} // class e
