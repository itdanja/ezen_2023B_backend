package day13;
/*

    - (접근제한자public/default) ( final ) class 클래스명{ }
    - (접근제한자public/default/protected/private) (정적static/인스턴스) ( final ) 타입 필드명;
    - (접근제한자public/default/protected/private) 생성자( ){ }
    - (접근제한자public/default/protected/private) (정적static/인스턴스) ( final ) 반환타입 메소드명(){}

    - 지역변수 : 함수 안에서
      ( final ) 타입 변수명;

 */

public class SportCar extends Car {

    //1.final 없는 메소드이면 오버라이딩 가능
    @Override
    public void speedUp() {
        speed += 10;
    }
    // 2. final 있는 메소드이면 오버라이딩 불가능
//    @Override
//    public void stop(){
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
