package 조별과제.조별과제2.팀과제2_3조.팀과제2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        MemberInfo[] user = new  MemberInfo[100];
        boolean a = true;
        Scanner scanner = new Scanner(System.in);
        Survice survice = new Survice();
        Survice2 survice2 = new Survice2();
        Survice3 survice3 = new Survice3();
        while ( a ) {


            System.out.println("===================구독 및 판매시스템===================");
            System.out.println("| 1.회원가입\t\t\t2.로그인\t\t\t\t3.종료\t\t|");
            System.out.println("=====================================================");

            System.out.print("선택 > ");
            int ch = scanner.nextInt();
            if (ch == 1) { // 1.회원가입
                // 1.입력받기
                System.out.print("회원번호 : ");
                int no = scanner.nextInt();
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();
                System.out.print("전화번호 : ");
                String num = scanner.next();
                System.out.print("생년월일 : ");
                String birth = scanner.next();
                // 2.객체생성
                MemberInfo newMemberInfo = new MemberInfo(no, name, id, pw, num, birth ,"",0,0);
                // 3. MemberInfo배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for (int i = 0; i < user.length; i++) {
                    if (user[i] == null) {
                        user[i] = newMemberInfo;

                        break; // 회원가입 성공 한번만 출력
                    }
                }
                System.out.println("회원가입 성공");
            } // if1 e
            if (ch == 2) { // 2.로그인
                // 1.입력받기
                System.out.println("아이디 비밀번호를 입력하세요");
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("비밀번호 : ");
                String pw = scanner.next();

                int 로그인위치 = 0;
                boolean 로그인여부 = false;
                for (int i = 0; i < user.length; i++) {
                    if (user[i] != null) {
                        if (user[i].id.equals(id) && user[i].pw.equals(pw)) {
                            로그인위치 = i;
                            로그인여부 = true;
                            break;
                        }
                    }
                }//for end
                if (로그인여부) {
                    System.out.println("로그인성공");
                } else {
                    System.out.println("로그인 실패");
                }


                while (로그인여부) {//로그인기능
                    System.out.println("================================================");
                    System.out.println("1.구독신청    2.사용현황     3.구독연장     4.종료");
                    System.out.println("================================================");
                    System.out.print("기능을 입력하세요 > ");
                    int ch1 = scanner.nextInt();

                    if (ch1 == 1) {
                        System.out.println("===================================");
                        System.out.println("1.베이직    2.스탠다드     3.프리미엄");
                        System.out.println("===================================");
                        System.out.print("상품을 선택하세여 > ");
                        int ch2 = scanner.nextInt();
                        System.out.print("사용할 개월수를 적어주세요 : ");


                        System.out.print("\n\n\n");

                        if (ch2 == 1) {


                            System.out.println("상품명 : " + survice._class);
                            System.out.println("가격 : " + survice.price);
                            System.out.println("용량 : " + survice.tb);
                            System.out.println("월 : " + survice.month +"개월");
                            System.out.println("인원 : " + survice.nOfP);

                            user[로그인위치].서비스 = survice._class;
                            user[로그인위치].month = survice.month;
                            user[로그인위치].price = survice.price;

                        } else if (ch2 == 2) {


                            System.out.println("상품명 : " + survice2._class);
                            System.out.println("가격 : " + survice2.price);
                            System.out.println("용량 : " + survice2.tb);
                            System.out.println("월 : " + survice2.month+"개월");
                            System.out.println("인원 : " + survice2.nOfP);

                            user[로그인위치].서비스 = survice2._class;
                            user[로그인위치].month = survice2.month;
                            user[로그인위치].price = survice2.price;

                        } else if (ch2 == 3) {


                            System.out.println("상품명 : " + survice3._class);
                            System.out.println("가격 : " + survice3.price);
                            System.out.println("용량 : " + survice3.tb);
                            System.out.println("월 : " + survice3.month+"개월");
                            System.out.println("인원 : " + survice3.nOfP);

                            user[로그인위치].서비스 = survice3._class;
                            user[로그인위치].month = survice3.month;
                            user[로그인위치].price = survice3.price;

                        }
                    } else if (ch1 == 2) {

                        // 회원번호 , 내가 저장한 상품명과 나머지
                        System.out.println("회원번호 : " + user[로그인위치].no);
                        String 내서비스 = user[로그인위치].서비스;
                        if (내서비스.equals(survice._class)) {
                            System.out.println("구독상품이름 : " + survice._class);
                            System.out.println("가격 : " + user[로그인위치].price);
                            System.out.println("용량 : " + survice.tb);
                            System.out.println("월 : " + user[로그인위치].month+"개월");
                            System.out.println("인원 : " + survice.nOfP);

                        } else if (내서비스.equals(survice2._class)) {
                            System.out.println("구독상품이름 : " + survice2._class);
                            System.out.println("가격 : " + user[로그인위치].price);
                            System.out.println("용량 : " + survice2.tb);
                            System.out.println("월 : " + user[로그인위치].month+"개월");
                            System.out.println("인원 : " + survice2.nOfP);


                        } else if (내서비스.equals(survice3._class)) {
                            System.out.println("구독상품이름 : " + survice3._class);
                            System.out.println("가격 : " + user[로그인위치].price);
                            System.out.println("용량 : " + survice3.tb);
                            System.out.println("월 : " + user[로그인위치].month+"개월");
                            System.out.println("인원 : " + survice3.nOfP);
                        }
                    } else if (ch1 == 3) {// 구독 연장

                        System.out.print("희망연장 개월수를 입력해주세요 : ");
                        int 금액 = 0;
                        int 입력개월 = scanner.nextInt();
                            if(user[로그인위치].서비스.equals(survice._class)){
                                금액 = survice.price*입력개월;
                            } else if (user[로그인위치].서비스.equals(survice2._class)) {
                                금액 = survice2.price*입력개월;
                            } else if (user[로그인위치].서비스.equals(survice3._class)) {
                                금액 = survice3.price*입력개월;
                            }
                        System.out.println("이용금액은 "+금액+"원 입니다.");
                                user[로그인위치].month += 입력개월;
                                user[로그인위치].price += 금액;

                    } else if (ch1==4) {
                        System.out.println("로그아웃");
                        break;
                    }

                } // w2 e


            } // if2 e
            else if (ch == 3) {
                System.out.println(" 프로그램 종료 ");
                break;

            }

        } // w e

    } // m e
} // c e
