package day05;

public class Step2 { // class e

    public static void main(String[] args) { // ms

        // p.165 : 배열(array) 타입
            /*
                - 변수는 하나의 값만 저장.
                1. 배열 : 연속된 공간에 값을 나열하고 각 값에 인덱스 부여.
                    - 인덱스 : 각 항목(요소)의 값을 호출 하거나 저장하는데 사용됨.
                2. 특징
                    1. 배열은 같은 타입의 값만 저장
                        int = [ 57 , "가" ]    불가능.
                    2. [고정길이] 배열의 길이는 선언된 이후 늘리거나 줄일 수 없다.
                        int = [ 57 , 62 , 97 ] : 항목/요소를 추가/삭제 할수 없다.
                3. 선언
                    - 변수선언 : 타입 변수명;
                    - 배열선언 : 타입[] 변수명;   vs  int 변수명[];

                4. 값 목록으로 배열 선언
                    - 배열생성1 : 타입[] 변수명 = { 값0 , 값1 , 값2 , 값3 };
                    - 배열생성2 : 타입[] 변수명 = new 타입[ 길이 ] ;
             */

        // 1. 배열 생성/선언 : 여러개 문자열을 저장하는 배열 선언.
        String season1 = "Spring";  String season2 = "Summer";
        String season3 = "Fall";    String season4 = "Winter";
                  // 배열이 없다면 vs 배열 있다면
        String[] season = { "Spring" , "Summer" , "Fall" , "Winter" };
        // 타입[] 변수명 = { 값0 , 값1 , 값2 , 값3 };
        //           인덱스: 0  ,  1  ,  2  , 3

        // 2. 배열의 각 요소/항목 의 값 호출
        System.out.println( "season : " + season );
        // 기본타입(7가지+String) 말고 참조타입 호출시 주소값이 나오는구나.
        // 1.일반호출
        System.out.println( "season[0] : " + season[0] );       // 배열내 0번 인덱스 호출
        System.out.println( "season[1] : " + season[1] );       // 배열내 1번 인덱스 호출
        System.out.println( "season[2] : " + season[2] );        // 배열내 2번 인덱스 호출
        System.out.println( "season[3] : " + season[3] );        // 배열내 3번 인덱스 호출
        // System.out.println( "season[4] : " + season[4] );     // 배열내 4번 인덱스 없으므로 호출 불가능
        //  ArrayIndexOutOfBoundsException : 인덱스 오류.

        // 2.for반복문을 이용한 호출
        for( int i = 0 ; i < season.length ; i++ ){
            // i는 0부터 마지막인덱스 까지 1씩증가.
            System.out.println( "season["+i+"] : " + season[i] );
        }

        // 3. 각 요소/항목의 값 수정
        season[1] = "여름"; //
        System.out.println( "season[1] : " + season[1] );


    } // me
} // ce












