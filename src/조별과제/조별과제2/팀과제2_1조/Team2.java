package 조별과제.조별과제2.팀과제2_1조;

import java.util.ArrayList;
import java.util.Scanner;
public class Team2 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<유저정보> 전체유저 = new ArrayList<유저정보>();
    static ArrayList<구독> 전체구독 = new ArrayList<구독>();
    static int login(){
        System.out.println("아이디와 비밀번호 입력");
        String id = scanner.nextLine();
        String pw = scanner.nextLine();
        for (int i=0; i<전체유저.size(); i++){
            if(전체유저.get(i).아이디.equals(id) && 전체유저.get(i).비밀번호.equals(pw)){
                return i;
            }
        }
        return -1;
    }
    static void register(){
        while (true){
            System.out.print("회원 가입할 아이디를 입력하세요 : ");
            String id = scanner.nextLine();
            for (유저정보 i:전체유저){
                if(i.아이디.equals(id)){
                    System.out.println("이미 존재하는 아이디입니다. 다시입력해주세요");
                    register();
                    return;
                }
            }
            System.out.print("회원 가입할 비밀번호를 입력하세요 : ");
            String pw = scanner.nextLine();

            // 이름입력
            System.out.print("회원 가입분의 이름을 입력하세요 : ");
            String name = scanner.nextLine();

            유저정보 newUser = new 유저정보(id,pw,name);
            전체유저.add(newUser);
            return;

        }

    }
    static void subnow(int usernum){
        if(전체유저.get(usernum).구독번호 == 0){
            System.out.println("구독정보가 없습니다.");
        }
        else{
            System.out.println("구독정보");
            System.out.println("구독번호: "+전체유저.get(usernum).구독번호);
            for(구독 i: 전체구독){
                if(전체유저.get(usernum).구독번호==i.구독번호){
                    System.out.println("타입:"+i.타입);
                    for (String j : i.구독인원){
                        System.out.println("구독중 : "+j);
                    }
                    System.out.println("구독기간: "+i.구독기간);
                }

            }
        }
    }
    static void sub(int userNum){
        System.out.print("구독번호입력 : ");
        int gNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("구독개월수 : ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.print("구독타입입력(베이직,프리미엄 만 입력하세요.) : ");
        String type = scanner.nextLine();
        구독 newsub = new 구독(gNo,month,type);
        전체구독.add(newsub);
        if(type.equals("베이직")){
            basic(userNum,gNo);
        }
        else if (type.equals("프리미엄")) {
            premium(userNum,gNo);
        }
        else{
            System.out.println("허가되지않은 입력입니다. 다시 시도해주세요");
            sub(userNum);
        }
    }
    static void basic(int userNum,int gNo){
        전체유저.get(userNum).구독번호 = gNo;
        for (구독 i: 전체구독){
            if(i.구독번호 == 전체유저.get(userNum).구독번호){
                i.구독인원.add(전체유저.get(userNum).아이디);
            }
        }
    }
    static void premium(int userNum, int gNo){
        basic(userNum,gNo);
        for(int i=0; i<3; i++){
            System.out.println("함께할 아이디를 입력해 주세요");
            String name = scanner.next();
            for (구독 j: 전체구독){
                if(j.구독번호 == 전체유저.get(userNum).구독번호){
                    j.구독인원.add(name);

                }
            }
            for (유저정보 j :전체유저){
                if(j.아이디.equals(name)){
                    j.구독번호 = gNo;
                }
            }

        }
    }
    static void subplus(int userNum){
        System.out.println("늘릴 개월수 입력:");
        int month = scanner.nextInt();
        for (구독 j: 전체구독){
            if(j.구독번호 == 전체유저.get(userNum).구독번호){
                j.구독기간 += month;
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1. 로그인 2. 회원가입");
            int ch = scanner.nextInt();
            scanner.nextLine();
            int userNum = -1;
            if (ch == 1) { // 로그인
                userNum= login();
            }
            if (ch == 2) { // 회원가입
                register();

            }
            while (userNum != -1){
                System.out.println("1. 로그아웃 2. 구독정보");
                int c = scanner.nextInt();
                scanner.nextLine();
                if(c == 1){
                    userNum = -1;
                }
                if (c == 2){
                    subnow(userNum);
                    System.out.println("1.구독하기 2.기간연장 3.로그아웃");
                    String ch1 = scanner.nextLine();
                    if (ch1.equals("1")){
                        sub(userNum);
                    }
                    else if(ch1.equals("2")){
                        subplus(userNum);
                    }
                    else if(ch1.equals("3")){
                        userNum = -1;
                    }

                }
            }





    }
}
}

class 유저정보{
    String 이름;
    int 유저번호;
    String 아이디;
    String 비밀번호;
    int 구독번호;
    유저정보(String 이름, String 아이디, String 비밀번호){
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
        this.이름 = 이름;
    }

//  필수x
    String 회사명;
    String 주소;
    String 전화번호;
    String 이메일;

}

class 구독 {
    구독(int 구독번호, int 구독개월,String 타입){
        this.구독번호 = 구독번호;
        this.구독기간 = 구독개월;
        this.타입 =타입;
    }
    int 구독번호;
    ArrayList<String> 구독인원 = new ArrayList<String>();
    String 타입;
    int 구독기간;

}
