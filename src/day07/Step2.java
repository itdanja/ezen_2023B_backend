package day07;

// ========== 클래스 용도 : 2.실행클래스 ===========//
public class Step2 { // cs

    public static void main(String[] args) { // ms

        // p.215
        // 1. 객체 생성
            // 1. new
        //new
            // 2. 생성자/클래스명
        //new 생성자/클래스명();
            // 3. 변수 선언
        //Car car ;
            // +
        Car myCar = new Car();

        // . : 접근연산자 : 변수가 가지고 있는 주소의 객체 접근
        System.out.println("모델명 : "+ myCar.model );
        System.out.println("시동여부 : " + myCar.start );
        System.out.println("현재속도 : " + myCar.speed );

        Car yourCar = new Car();

        System.out.println("모델명 : "+ yourCar.model );
        System.out.println("시동여부 : " + yourCar.start );
        System.out.println("현재속도 : " + yourCar.speed );


        // p.217
        // * 필드는 객체의 데이터 이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
            // 1. 객체 생성
        Car2 myCar2 = new Car2();
            // 2. 객체내 필드 호출
        System.out.println("제작회사 : " + myCar2.company); // 현대자동차
        System.out.println("모델명 : " + myCar2.model);
        System.out.println("색깔 : " + myCar2.color);
        System.out.println("최고속도 : " + myCar2.maxSpeed);
        System.out.println("현재속도 : " + myCar2.speed);
            // 3. 객체내 필드의 값 수정
        myCar2.speed = 60;
        System.out.println("현재속도 : " + myCar2.speed);

        // =============
        Car2 yourCar2 = new Car2();
        System.out.println("제작회사 : " + yourCar2.company);  // 현대자동차.

        System.out.println("현재속도 : " + yourCar2.speed);
    } // me
} // ce

















