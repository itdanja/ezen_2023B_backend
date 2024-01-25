package day18.view;

import day18.controller.MemberController;

import java.util.Scanner;

public class BoardView {
    // 싱글톤
    private BoardView(){}
    private static BoardView boardView = new BoardView();
    public static BoardView getInstance(){  return boardView;}
    //입력객체
    Scanner scanner = MainView.getInstance().scanner;

    // 0.로그인 성공시 출력되는 화면.
    public void run(){
        while (true){
            System.out.println("=========== ezen 게시판 ===========");
            // 추후에 현재 게시물 출력 메소드 가 들어갈 자리
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택> ");  int ch = scanner.nextInt();

            if( ch == 1 ){}
            else if ( ch == 2 ){}
            else if( ch == 3 ){
                System.out.println("<안내> 로그아웃이 되었습니다. " );
                MemberController.getInstance().logout(); // 회원컨트롤러 에 로그아웃처리 요청
                return; // 현재 메소드 종료.
            }
        } // w end
    } // m end
} // c end
