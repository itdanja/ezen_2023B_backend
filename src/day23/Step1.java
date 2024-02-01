package day23;

import day14.Car;

import java.util.*;

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
        System.out.println( "배열 길이 : " + strArray.length );
            //  Arrays.toString( 배열타입변수 ) : 해당 배열 상태 호출
        strArray[1] = null; // 배열은 고정길이 이기때문에 삭제

        System.out.println("=====================================");

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
        System.out.println( "리스트 길이 : " + strList.size() );
        strList.remove( 1 ); // 1번 인덱스 삭제
        System.out.println( "1번 인덱스 삭제 후 리스트 상태 : " + strList );

        System.out.println("=====================================");
        // 3. 가변길이배열객체 만들기.
        // SimpleList[  객체 , 객체 , 객체 ]
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        System.out.println( "리스트 상태 : " + simpleList );
        System.out.println( "리스트 요소 호출 :" + simpleList.get( 1 ) );
        System.out.println( "리스트 길이 : " + simpleList.size() );
        simpleList.remove( 1 );
        System.out.println( "1번 인덱스 삭제 후 리스트 상태 : " + simpleList );

        /*

        ArrayList< ArrayList<String> > list = new ArrayList<>();
        // 클래스 <---> 타입 생성
        [  [  ] , [ ] , [ ] , [ ] ]

        ArrayList< HashMap< String ,String > > list = new ArrayList<>();
        [  { JSON } , { JSON } , { JSON } , { JSON  } , { JSON } ]


        입출력/프론트     ------ 데이터 통신 --------> 로직/백엔드
        JS                                          JAVA
                                                    컨트롤러/서비스 ---------------> DB
        [ 값,값,값]                                  ArrayList                      SQL
        { 속성명:값,속성명:값 }                        HashMap

        [   { 속성명:값,속성명:값 } ,                  ArrayList< HashMap< String ,String > >
            { 속성명:값,속성명:값 } ,
            { 속성명:값,속성명:값 } ,
            { 속성명:값,속성명:값 }
        ]
                                프레임워크
                                + 스프링 프레임워크
        */

        // JS
            // JS 배열: [ 값1, 값2 , 값3 ] => List
            // JS 객체: { 필드 : 값 , 필드 : 값 , 필드 : 값 } => Map

        /*


    1. - 제네릭을 이용한 ArrayList 구현   / JS :[ 값1, 값2 , 값3 ]
    2. - 제네릭을 이용한 HashMap 구현  / JS : { 속성명 : 값 , 속성명  : 값 , 속성명 : 값 }
        - 속성명은 중복 불가.
        let object = {
            name = "유재석",
            age = 40
        }
        -  필수 메소드 구현
            - add( v , k ) 		: key 와 value 매개변수로 전달.
            - get( key ) ,		: key 매개변수로 전달해서 value 출력
            - remove( index ) , 		: index 매개변수로 전달해서 해당 속성과값 삭제
            - size() , 			: 속성 개수 출력
		    - toString()		: { 속성명 : 값 , 속성명  : 값 , 속성명 :

         */


    } //me
} // ce




