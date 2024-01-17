package day12.view;

import day12.model.MemberDto;

import java.util.Scanner;

// VIEW : 화면구현 ( 입출력 )
public class MemberView {


    // 1.회원가입 메소드
    public void signup(){
        // MainView.getInstance(): 싱글톤(미리 만들어진 단 하나의 객체) 호출
        Scanner scanner = MainView.getInstance().scanner;
        // 1.입력받는다.
        System.out.println("아이디 : " );  String id = scanner.next();
        System.out.println("비밀번호 : ");  String pw = scanner.next();
        System.out.println("이름 : ");    String name = scanner.next();
        System.out.println("전화번호 : ");  String phone = scanner.next();
        // 2.객체화
        MemberDto memberDto = new MemberDto( 0 , id , pw , name , phone );

        // 3. 객체를 컨트롤에게 전달(매개변수/회원가입 필요한 정보·객체)후
            //  처리 결과( 리턴/회원가입 처리 결과(t성공/f실패) · boolean ) 를 받기

    }
}












