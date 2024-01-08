package 조별과제.조별과제1.조3_도서관좌석프로그램;

import java.util.Scanner;

public class Team3_2 {   // class S
    public static void main(String[] args) {    // main S
        Scanner scanner = new Scanner(System.in);
        String[] 좌석 = new String[3];
        String[] 시 = new String[3];
        String[] 분 = new String[3];

        int sumTime = 0;

        while (true){

            // 현재 좌석 상태 출력
            System.out.println("\n------------------- 현재 좌석을 표시합니다. -------------------");
            System.out.printf("%13s\t %13s %13s\n","좌석1","좌석2","좌석3");
            System.out.printf("%13s\t %13s %13s\n",좌석[0] == null ? "빈좌석": 좌석[0],좌석[1] == null ? "빈좌석": 좌석[1],좌석[2] == null ? "빈좌석": 좌석[2]);
            System.out.printf("%12s시\t %12s시\t %12s시\n",시[0] == null ? "00" : 시[0],시[1] == null ? "00" : 시[1],시[2] == null ? "00" : 시[2]);
            System.out.printf("%12s분\t %12s분\t %12s분\n",분[0] == null ? "00" : 분[0],분[1] == null ? "00" : 분[1],분[2] == null ? "00" : 분[2]);
            System.out.println("------------------------------------------------------------");

            // 입실/퇴실/계산 선택
            System.out.print("입실/퇴실/계산 중에 선택해 주세요. : ");
            String ch = scanner.nextLine();
            if(ch.equals("입실")){
                System.out.print("좌석을 선택해 주세요. : ");
                int 좌석선택 = scanner.nextInt();scanner.nextLine();
                좌석선택--;
                if(좌석[좌석선택] == null){
                    System.out.print("전화번호를 선택해 주세요. : ");
                    String 번호 = scanner.nextLine();
                    System.out.print("입실시간 시를 선택해 주세요. : ");
                    String 입시 = scanner.nextLine();
                    System.out.print("입실시간 분을 선택해 주세요. : ");
                    String 입분 = scanner.nextLine();
                    좌석[좌석선택] = 번호;
                    시[좌석선택] = 입시;
                    분[좌석선택] = 입분;
                } else {
                    System.out.println("입실불가\n");
                }
            } else if(ch.equals("퇴실")){
                System.out.print("좌석을 선택해 주세요. : ");
                int 좌석선택 = scanner.nextInt();scanner.nextLine();
                좌석선택--;
                if(좌석[좌석선택] == null){
                    System.out.println("입실이 없습니다.\n");
                } else {
                    System.out.print("전화번호를 입력해 주세요. : ");
                    String 전화번호 = scanner.nextLine();
                    if(좌석[좌석선택].equals(전화번호)){
                        System.out.print("퇴실시간 시를 선택해 주세요. : ");
                        int 퇴실시 = scanner.nextInt();scanner.nextLine();
                        System.out.print("퇴실시간 분을 선택해 주세요. : ");
                        int 퇴실분 = scanner.nextInt();scanner.nextLine();
                        int 입실시 = Integer.parseInt(시[좌석선택]);
                        int 입실분 = Integer.parseInt(분[좌석선택]);
                        int 시간 =(퇴실시*60 + 퇴실분) - (입실시*60 + 입실분);
                        if(시간 > 0){
                            좌석[좌석선택] = null;
                            시[좌석선택] = null;
                            분[좌석선택] = null;
                            sumTime += 시간;
                            System.out.printf("퇴실완료[ 좌석을 이용한 시간(분) : %3d분 ]\n", 시간);
                        } else {
                            System.out.println("퇴실시간 오류");
                        }
                    } else {
                        System.out.println("번호가 다릅니다.");
                    }
                }
            } else if(ch.equals("계산")){
                System.out.println("총 사용 시간 : " + sumTime+"분");
                break;
            }
        }

    }   // main E
}