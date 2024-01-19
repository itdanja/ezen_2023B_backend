package day14;

public class Step3 {
    public static void main(String[] args) {
        // 1. 객체 생성
        Car myCar = new Car();      // myCar.tire = null;
            // myCar.run();        // null:참조값이 없다. -> (.)도트연산자 사용불가.
            // .NullPointerException
        // - 객체
        Car yourCar = new Car();
        yourCar.tire = new Tire();
        yourCar.run();                      // System.out.println("일반 타이어가 회전합니다.");

        // 2. 객체의 필드 값 수정 => 타이어 장착
        myCar.tire = new Tire();            // myCar.tire = Tire객체참조;
        myCar.run();                        // System.out.println("일반 타이어가 회전합니다.");
        // ---------- 필드 다형성: 필드가 가지고 있는 객체참조의 타입을 변경 -----------//
        myCar.tire = new HankookTire();     // myCar.tire = HankookTire객체참조;
        myCar.run();                        // System.out.println("한국 타이어가 회전합니다.");
        // --
        myCar.tire = new KumhoTire();       // myCar.tire = KumhoTire객체참조;
        myCar.run();                        // System.out.println("금호 타이어가 회전합니다.");
        yourCar.run();                      // System.out.println("일반 타이어가 회전합니다.");

    }
}
