package day10;

// 클래스 사용목적 : 1. 라이브러리(설계도)클래스 2.실행클래스

public class Step1 { // class c
    public static void main(String[] args) { // main s

        // 1. 객체 생성
            // 1-1 생성자 호출
            // 클래스명 변수명 = new 클래스명();
        캐릭터 user1 = new 캐릭터("자바맨");
            System.out.println("user1.닉네임 = " + user1.닉네임);
        System.out.println("user1.toString() = " + user1.toString());

        캐릭터 user2 = new 캐릭터("클래스맨");
            System.out.println("user2.닉네임 = " + user2.닉네임);

        // 2. 필드 사용
            user1.직업 = "마법사";
        System.out.println("user1.toString() = " + user1.toString());
            user2.직업 = "전사";
        System.out.println("user2.toString() = " + user2.toString());

        // 3. 메소드 호출
            user1.공격();
        System.out.println("user1.toString() = " + user1.toString());
            user2.공격();
        System.out.println("user2.toString() = " + user2.toString());

    } // main e
} // class e
