package day04;

import java.util.Random;

public class Step1 { // class s
    public static void main(String[] args) { // main s

        // p.110
            // 제어문 : 1.조건문 2.반복문
            // 흐름제어 : 조건문( { } 이후 정상흐름 )
            //          반복문( { } 이후 제어문으로 되돌아감 ) - 루핑
        // if문
            // if( 조건식 ) { 실행문; 실행문; }
            // if( 조건식 ) 실행문;
            // if( 조건삭 ) { } else{ }

        // p.111
        int score = 93; // 1. 변수 초기화
        if( score >= 90 ){ // if s
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } // if e
        if( score < 90 )
            System.out.println("점수가 90보다 적습니다.");
            System.out.println("등급은 B등급입니다."); // IF 조건식에 관련없이 무조건 실행

        // p.113
        if( score >= 90 ){ // if s
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }else{ // 아니면
            System.out.println("점수가 90보다 적습니다.");
            System.out.println("등급은 B입니다.");
        }  // if e

        // p.114
        if( score >=90 ){ // if  [ 조건식1 ]
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A등급 입니다.");
        // }else if ( score >= 80 && score<=90 ){ // [조건식2]
        }else if ( score >= 80  ){ // [조건식2]
            System.out.println("점수가 80~89입니다. ");
            System.out.println("등급은 B등급 입니다.");
        }else if( score >= 70 ){// [조건식3]
            System.out.println("점수가 70~79입니다. ");
            System.out.println("등급은 C등급 입니다.");
        }else{ // 그외
            System.out.println("점수가 70미만입니다.");
            System.out.println("등급은 D등급 입니다.");
        }

        // p.115 난수 만들기 : Math.random() , Random 클래스
            // 1. Math.random() : 난수 함수
        System.out.println( "0이상 ~1미만 난수/랜덤 생성 : "+ Math.random() );
            // 2. Random() : 난수 객체.
        System.out.println( new Random() );
        System.out.println( new Random().nextInt() );

        // 주사위 난수 : 1~6 사이의 난수 생성
        // 1.
        //int num = Math.random();              // 0.xx~1.xx
        //int num = Math.random()*6;            // 0.xx~1.xx * 6    =>   0 ~ 6 미만
        //int num = Math.random()*6+1;          // 0.xx~1.xx * 6 +1   =>   1 ~ 7 미만
        int num = (int)( Math.random()*6+1 );    //  (int) 0.xx~1.xx * 6 + 1   =>   1 ~ 7 미만 => 1~6
        // 2.
        Random random = new Random();
        // 클래스명 변수명 = new 클래스명(); // 클래스에 해당하는 객체 생성 ( 객체 만드는 이유 : 라이브러리(미리 만들어진 코드) )
        // int num2 = random.nextInt(); // int 허용범위내 난수 생성  +-21억정도 중 난수.
        //int num2 = random.nextInt(6); // 0 ~ 6미만
        int num2 = random.nextInt(6)+1; // 0 ~ 6미만 +1  =>  1~7미만 => 1~6

        if( num2 == 1  ){   System.out.println("주사위 1 입니다.");  }
        else if( num2 == 2  ){   System.out.println("주사위 2 입니다.");  }
        else if( num2 == 3  ){   System.out.println("주사위 3 입니다.");  }
        else if( num2 == 4  ){   System.out.println("주사위 4 입니다.");  }
        else if( num2 == 5  ){   System.out.println("주사위 5 입니다.");  }
        else{ System.out.println("주사위 6 입니다.");  }
















    } // main e
} // class e
