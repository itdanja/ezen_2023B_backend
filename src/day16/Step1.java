package day16;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Step1 {
    public static void main(String[] args) {
        // 1. 인터페이스 변수 선언
        RemoteControl rc;
        // 2. 인터페이스 변수에 객체참조 값 대입
        rc = new Television(); // - 다형성
            //  RemoteControl rc = new Television();
            // 타입이 다른데 가능한 이유 : extends , implements
        // 3. 인터페이스의 메소드 호출하면 구현객체의 메소드가 호출된다.
        rc.turnOn();
        rc.setVolume( 5 ); // 텔레비전의 볼륨 5로 설정
        rc.turnOff();       // 텔레비전을 끕니다.

        // 다형성( 교체 )
        rc = new Audio();
        rc.turnOn();
        rc.setVolume( 5 );  // 오디오의 볼륨 5로 설정
        rc.turnOff();       // 오디오를 끕니다.

        // 인터페이스의 상수필드 호출
        System.out.println( RemoteControl.MAX_VOLUME );
        System.out.println( RemoteControl.MIN_VOLUME );


    } // me
} // ms
