package 조별과제.조별과제2.팀과제2_4조;

import java.util.Scanner;

public class Step1 {
    static Scanner scanner = new Scanner(System.in);
    static Member[] memberArray = new Member[100];
    static Service[] serviceArray = new Service[100];
    static boolean btn = false;
    public static void main(String[] args) {

    int num = 0;

        while(true){
            System.out.println("============== 메뉴 ===========");
            System.out.println(" 1.로그인 | 2.회원가입 | 3.종료 ");
            System.out.println("============================");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();


            if(ch==1){
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.next();

                for(int i=0; i<memberArray.length; i++){
                    if(memberArray[i].id.equals(id) && memberArray[i].pw.equals(pw)){
                        System.out.println("로그인 성공!");
                        System.out.println(memberArray[i].toString());
                        btn = true;
                        num = memberArray[i].memberNum;
                        break;
                    }
                }
            }else if(ch==2){    // else if start
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.next();
                System.out.print("이름을 입력해주세요 : ");
                String name = scanner.next();
                System.out.print("주민등록번호를 입력해주세요 : ");
                String rrn = scanner.next();
                System.out.print("핸드폰번호를 입력해주세요 : ");
                String phone = scanner.next();
                Member.count++;
                Member member = new Member(id, pw, name, rrn, phone);
                for (int i=0; i<memberArray.length; i++){
                    if(memberArray[i]==null){
                        memberArray[i]=member;
                        System.out.println("회원가입 성공");
                        break;
                    }
                }
            }   // else if end
            while(btn){
                for(int i=0; i<serviceArray.length; i++){
                    if(serviceArray[i] != null && num == serviceArray[i].memberNum){
                        Service service = serviceArray[i];
                        서비스출력(service);
                        break;  // 서비스 출력 종료 후 (로그아웃시) 초기메뉴 가기위해
                    }else{
                        System.out.println("============== 구독신청 ===========");
                        System.out.println(" 1.Basic | 2.Standard | 3.Premium");
                        System.out.println("============================");
                        System.out.print("선택 > ");
                        int no = scanner.nextInt();
                        서비스가입(num , no);

                    } // else
                } // 1 for

            } // 2 w e
        } // 1 w e

    }

    static void 서비스출력(Service service){
        Service srv = service;
        while (true){
            System.out.println("======== 서비스 선택 메뉴 ======");
            System.out.println("1.내정보 2.서비스연장신청 3.로그아웃");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();

            if (ch == 1){
                내정보출력(srv);
                break;
            }
            if (ch == 2){
                서비스연장신청(srv);
                break;
            }
            if (ch == 3){
                btn = false;
                return;
            }else {
                System.out.println("올바른 선택이 아닙니다.");
                break;
            }
        }
    }

    static void 서비스가입(int num , int no){
        Service service = new Service();
        if(no == 1){
            System.out.print("basic 가격은 : 5000원 입니다. 1. 지불 2. 거절 > ");
            int ch = scanner.nextInt();
            if(ch == 1){
                System.out.println("지불하였습니다.");
                service.basic(num);
                for(int i = 0 ; i < serviceArray.length; i++){
                    if(serviceArray[i] == null){
                        serviceArray[i] = service;
                    }

                } // for e

            }else {
                System.out.println("가격지불을 거절하였습니다.");
            }

        } else if (no == 2) {
            System.out.print("basic 가격은 : 10000원 입니다. 1. 지불 2. 거절 > ");
            int ch = scanner.nextInt();
            if(ch == 1){
                System.out.println("지불하였습니다.");
                service.standard(num);
                for(int i = 0 ; i < serviceArray.length; i++){
                    if(serviceArray[i] == null){
                        serviceArray[i] = service;
                    }
                } // for e

            }else {
                System.out.println("가격지불을 거절하였습니다.");
            }

        } else if (no == 3) {
            System.out.print("basic 가격은 : 15000원 입니다. 1. 지불 2. 거절 > ");
            int ch = scanner.nextInt();
            if(ch == 1){
                System.out.println("지불하였습니다.");
                service.premium(num);
                for(int i = 0 ; i < serviceArray.length; i++){
                    if(serviceArray[i] == null){
                        serviceArray[i] = service;
                    }
                } // for e

            }else {
                System.out.println("가격지불을 거절하였습니다.");
            }

        }
    }

    static void 내정보출력(Service service){
        Service s = service;
        for(int i = 0 ; i < memberArray.length ; i++){
            if(s.memberNum == memberArray[i].memberNum){
                System.out.printf("아이디 : %-10s 닉네임 : %-6s 총용량 : %.1f 사용기간 %-5s\n", memberArray[i].id,memberArray[i].name , s.volume , s.period);
                break;
            }
        }
    }
    static void 서비스연장신청(Service service){
        Service s = service;
        System.out.println("현재 사용중인 서비스 " + s.rating + "을 연장하시겠습니까?");
        System.out.print("1.연장 2. 취소 > ");
        int ch = scanner.nextInt();
        if (ch == 1){
            int num1 = (Integer.parseInt(s.period)) + 30;
            s.period = Integer.toString(num1);
            System.out.println("연장되었습니다.");
            System.out.println("현재 사용기간은 : "+ s.period + "일 입니다..");

        } else if ( ch == 2) {
            System.out.println("취소하였습니다.");
        }else {
            System.out.println("[경고] 올바른 선택이 아닙니다.");
        }

    }

}// c e

