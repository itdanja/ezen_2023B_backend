package day12.model;

import day12.controller.MemberController;

// DAO : 데이터베이스 접근 객체
public class MemberDao {
    // 싱글톤
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){ return memberDao; }

    // DB 대신에 배열
    MemberDto[] memberDtos = new MemberDto[100];

    // 1. 회원가입 메소드
    public boolean signup( MemberDto memberDto ){
        System.out.println("MemberDao.signup");
        for( int i = 0 ; i < memberDtos.length ; i++ ){
            if( memberDtos[i] == null ){
                memberDtos[i] = memberDto;
                return true; // 회원가입 성공
            }
        }
        return false; // 회원가입 실패
    } // f end
}
