package 조별과제.조별과제1.조3_도서관좌석프로그램;

import java.util.Scanner;

public class Team3 {   // class S
    public static void main(String[] args) {    // main S
        Scanner scanner = new Scanner(System.in);
        String 좌석1 = "빈좌석";      String 좌석2= "빈좌석";       String 좌석3="빈좌석";
        String 좌석1시 = "0";      String 좌석2시 = "0";      String 좌석3시 = "0";
        String 좌석1분 = "0";      String 좌석2분 = "0";      String 좌석3분 = "0";

        int sumTime = 0;

        while (true){

            // 현재 좌석 상태 출력
            System.out.println("\n------------------- 현재 좌석을 표시합니다. -------------------");
            System.out.printf("%13s\t %13s %13s\n","좌석1","좌석2","좌석3");
            System.out.printf("%13s\t %13s %13s\n",좌석1,좌석2,좌석3);
            System.out.printf("%12s시\t %12s시\t %12s시\n",좌석1시,좌석2시,좌석3시);
            System.out.printf("%12s분\t %12s분\t %12s분\n",좌석1분,좌석2분,좌석3분);
            System.out.println("------------------------------------------------------------");

            // 입실/퇴실/계산 선택
            System.out.print("입실/퇴실/계산 중에 선택해 주세요. : ");
            String ch = scanner.nextLine();
            if(ch.equals("입실")){
                System.out.print("좌석을 선택해 주세요. : ");
                String 좌석선택 = scanner.nextLine();
                System.out.print("전화번호를 선택해 주세요. : ");
                String 번호 = scanner.nextLine();
                if(좌석선택.equals("좌석1")){
                    if(좌석1.equals("빈좌석")){
                        System.out.print("입실시간 시를 선택해 주세요. : ");
                        String 시 = scanner.nextLine();
                        System.out.print("입실시간 분을 선택해 주세요. : ");
                        String 분 = scanner.nextLine();
                        좌석1 = 번호;
                        좌석1시 = 시;
                        좌석1분 = 분;
                    } else {
                        System.out.println("입실불가\n");
                    }
                } else if (좌석선택.equals("좌석2")) {
                    if(좌석2.equals("빈좌석")){
                        System.out.print("입실시간 시를 선택해 주세요. : ");
                        String 시 = scanner.nextLine();
                        System.out.print("입실시간 분을 선택해 주세요. : ");
                        String 분 = scanner.nextLine();
                        좌석2 = 번호;
                        좌석2시 = 시;
                        좌석2분 = 분;
                    } else {
                        System.out.println("입실불가\n");
                    }

                } else if (좌석선택.equals("좌석3")) {
                    if(좌석3.equals("빈좌석")){
                        System.out.print("입실시간 시를 선택해 주세요. : ");
                        String 시 = scanner.nextLine();
                        System.out.print("입실시간 분을 선택해 주세요. : ");
                        String 분 = scanner.nextLine();
                        좌석3 = 번호;
                        좌석3시 = 시;
                        좌석3분 = 분;
                    } else {
                        System.out.println("입실불가\n");
                    }

                } else {
                    System.out.println("입실불가\n");
                }
            } else if(ch.equals("퇴실")){
                System.out.print("좌석을 선택해 주세요. : ");
                String 좌석선택 = scanner.nextLine();
                if(좌석선택.equals("좌석1")){
                    if(좌석1.equals("빈좌석")){
                        System.out.println("입실이 없습니다.\n");
                    } else {
                        System.out.print("퇴실시간 시를 선택해 주세요. : ");
                        String 시 = scanner.nextLine();
                        System.out.print("퇴실시간 분을 선택해 주세요. : ");
                        String 분 = scanner.nextLine();

                        int 입실시 = Integer.parseInt(좌석1시);
                        int 입실분 = Integer.parseInt(좌석1분);
                        int 퇴실시 = Integer.parseInt(시);
                        int 퇴실분 = Integer.parseInt(분);
                        int 시간 =(퇴실시*60 + 퇴실분) - (입실시*60 + 입실분);
                        if(시간 > 0){
                            좌석1 = "빈좌석";
                            좌석1시 = "0";
                            좌석1분 = "0";
                            sumTime += 시간;
                            System.out.printf("퇴실완료[ 좌석을 이용한 시간(분) : %3d분 ]\n", 시간);
                        } else {
                            System.out.println("퇴실시간 오류");
                        }
                    }
                } else if (좌석선택.equals("좌석2")) {
                    if(좌석2.equals("빈좌석")){
                        System.out.println("입실이 없습니다.\n");
                    } else {
                        System.out.print("퇴실시간 시를 선택해 주세요. : ");
                        String 시 = scanner.nextLine();
                        System.out.print("퇴실시간 분을 선택해 주세요. : ");
                        String 분 = scanner.nextLine();

                        int 입실시 = Integer.parseInt(좌석2시);
                        int 입실분 = Integer.parseInt(좌석2분);
                        int 퇴실시 = Integer.parseInt(시);
                        int 퇴실분 = Integer.parseInt(분);
                        int 시간 =(퇴실시*60 + 퇴실분) - (입실시*60 + 입실분);
                        if(시간 > 0){
                            좌석2 = "빈좌석";
                            좌석2시 = "0";
                            좌석2분 = "0";
                            sumTime += 시간;
                            System.out.printf("퇴실완료[ 좌석을 이용한 시간(분) : %3d분 ]\n", 시간);
                        } else {
                            System.out.println("퇴실시간 오류");
                        }
                    }
                } else if (좌석선택.equals("좌석3")) {
                    if(좌석3.equals("빈좌석")){
                        System.out.println("입실이 없습니다.\n");
                    } else {
                        System.out.print("퇴실시간 시를 선택해 주세요. : ");
                        String 시 = scanner.nextLine();
                        System.out.print("퇴실시간 분을 선택해 주세요. : ");
                        String 분 = scanner.nextLine();

                        int 입실시 = Integer.parseInt(좌석3시);
                        int 입실분 = Integer.parseInt(좌석3분);
                        int 퇴실시 = Integer.parseInt(시);
                        int 퇴실분 = Integer.parseInt(분);
                        int 시간 =(퇴실시*60 + 퇴실분) - (입실시*60 + 입실분);
                        if(시간 > 0){
                            좌석3 = "빈좌석";
                            좌석3시 = "0";
                            좌석3분 = "0";
                            sumTime += 시간;
                            System.out.printf("퇴실완료[ 좌석을 이용한 시간(분) : %3d분 ]\n", 시간);
                        } else {
                            System.out.println("퇴실시간 오류");
                        }
                    }
                } else {
                    System.out.println("입실이 없습니다.\n");
                }
            } else if(ch.equals("계산")){
                System.out.println("총 사용 시간 : " + sumTime+"분");
                break;
            }
        }

    }   // main E
}   //class E

/*
    3. 도서관 좌석 프로그램 ( 1~3 좌석 3개 )
       [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
          1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
             String 좌석1 = "";      String 좌석2= "";       String 좌석3="";
             String 좌석1시 = "";      String 좌석2시 = "";      String 좌석3시 = "";
             String 좌석1분 = "";      String 좌석2분 = "";      String 좌석3분 = "";

          2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 좌석 상황을 반복적으로 출력합니다.

          3. 입실: 사용자로부터 좌석 선택과 전화번호 를 입력받습니다.
             - 단 해당 좌석이 있을경우 '입실불가' 없으면 '입실완료' 출력 합니다.

          4. 퇴실 : 사용자로부터 좌석 과 현재시간(시/분)을 입력받습니다.
             - 단 해당 좌석이 있을경우 '퇴실완료[ 좌석을 이용한 시간(분) : 000분 ] ' 없으면 '입실이 없습니다' 출력 합니다.

          5. 계산 : 총 사용시간을 계산합니다.
*/
