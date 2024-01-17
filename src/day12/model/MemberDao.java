package day12.model;

import day12.controller.MemberController;

import java.util.ArrayList;

// DAO : 데이터베이스 접근 객체
public class MemberDao {
    // 싱글톤
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){ return memberDao; }

    // DB 대신에 배열
        // 배열 사용시 불편한점 : 고정길이
        // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리집합)
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        // ArrayList<여러개저장할객체의타입> 변수명 = new ArrayList<>();
        // 제공하는 함수
                // 저장 : java[ .add( 저장할 객체 ) ]  vs  js[ .push( 저장할 데이터 ) ]
    // MemberDto[] memberDtos = new MemberDto[100];
    ArrayList<MemberDto> memberDtos = new ArrayList<>();

    // 1. 회원가입 메소드
    public boolean signup( MemberDto memberDto ){
        System.out.println("MemberDao.signup");

        memberDtos.add( memberDto );

        return true; // 회원가입 성공
    } // f end
}

/*
for( int i = 0 ; i < memberDtos.length ; i++ ){
    if( memberDtos[i] == null ){
        memberDtos[i] = memberDto;
        return true; // 회원가입 성공
    }
}
*/