package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class Step1 {

    public static void main(String[] args) {

        // 1. 배열타입 : 고정길이
            // 객체{ 객체 , 객체 , 객체 }
        String[] strArray = new String[3]; // String타입 데이터/객체 3개를 저장/참조 하는 배열타입
        strArray[0] = "유재석";
        // strArray[1] = 100; // X  타입이 다르니까 오류.
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
        // strArray[3] = "서장훈"; // ArrayIndexOutOfBoundsException
        System.out.println( "배열  상태 : " + Arrays.toString( strArray )  );
        System.out.println( "배열 요소 호출 : "+ strArray[1] );
            //  Arrays.toString( 배열타입변수 ) : 해당 배열 상태 호출

        // 2. 클래스타입 : *컬렉션프레임워크( 수집관련라이브러리 제공 )
            // 객체{ 객체 , 객체 , 객체 }
            // 1. ArrayList : 가변길이 가능하도록 만든 객체
        ArrayList<String> strList = new ArrayList<>();
            // 클래스명<제네릭타입> 변수명 = new 클래스명<>();
        strList.add("유재석");
        // strList.add( 100 );
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");
        System.out.println( "리스트 상태 : " + strList );
        System.out.println( "리스트 요소 호출 : " + strList.get(1) );


        // 3. 가변길이배열객체 만들기.
        // SimpleList{  객체 , 객체 , 객체 }
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("신동엽");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        System.out.println( "리스트 상태 : " + simpleList );
        System.out.println( "리스트 요소 호출 :" + simpleList.get( 1 ) );

        SimpleList<Integer> intList = new SimpleList<>();
        intList.add( 100 );
        intList.add( 200 );
        intList.add( 300 );
        intList.add( 400 );



    } //me
} // ce
