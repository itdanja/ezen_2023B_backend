package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;

// CONTROLLER : VIEW 와 DAO 중계역할
public class MemberController {

    // 싱글톤
    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){ return memberController; }
    // 1. 회원가입 메소드
    public boolean signup( MemberDto memberDto ){
        System.out.println("MemberController.signup");
        // 1.유효성검사 처리
        // 2.view받은 객체를 DAO에게 전달 후 처리 결과 를 받기
        boolean result = MemberDao.getInstance().signup( memberDto );
        return result;
    }
}
