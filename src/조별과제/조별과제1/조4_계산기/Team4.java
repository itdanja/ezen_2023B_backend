package 조별과제.조별과제1.조4_계산기;

import java.math.BigDecimal;
import java.util.Scanner;

public class Team4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String 피연산자1 = "";
        String 피연산자2 = "";
        String 연산자 = "";


        BigDecimal num3 = new BigDecimal(0); // 임의의 저장 변수 누적용


        boolean run3 = true; // 수 유효성 검사 함수
        while (run3) {
            System.out.print("연산할 수를 입력하세요. : ");
            피연산자1 = scanner.nextLine();
            for (int i = 0; i <= 피연산자1.length() - 1; i++) {
                char a = 피연산자1.charAt(i);
                //System.out.println((int)'0'); 48
                //System.out.println((int)'9'); 57
                if (48 <= (int) a && (int) a <= 57) {   // 아스키코드의 0 48 9는 57
                    if (i ==피연산자1.length()-1){ run3 = false;}
                } else {
                    System.out.println("숫자만 입력하세요."); break;
                }
            }
        }
        BigDecimal num1 = new BigDecimal(피연산자1);





        while (true){ // 반복문 시작

            System.out.print("연산자를 입력하세요. : ");
            연산자 = scanner.nextLine();

            boolean run4 = true; // 수 유효성 검사 함수
            while (run4) {  // 유효성 검사 반복
                System.out.print("연산할 두번째 수를 입력하세요. : ");
                피연산자2 = scanner.nextLine();

                for (int i = 0; i <= 피연산자2.length() - 1; i++) {
                    char a = 피연산자2.charAt(i);
                    //System.out.println((int)'0'); 48
                    //System.out.println((int)'9'); 57

                    if (48 <= (int) a && (int) a <= 57) {
                        if (i == 피연산자2.length() - 1) {
                            run4 = false;
                        }
                    } else {
                        System.out.println("숫자만 입력하세요.");
                        break;
                    }
                }
            }

            BigDecimal num2 = new BigDecimal(피연산자2);

            boolean run2 = true;

            while (run2){ // 연산자 유효성 검사 반복문 및 조건 충족시 계산
                if(연산자.equals("+")) {
                    BigDecimal 덧셈 = num1.add(num2);
                    System.out.printf("덧셈 결과: %s\n" , 덧셈);
                    num3 = num1.add(num2);
                    run2 = false;
                } else if (연산자.equals("-")) {
                    BigDecimal 뺄셈 = num1.subtract(num2);
                    System.out.printf("뺄셈 결과: %s\n" , 뺄셈);
                    num3 = num1.subtract(num2);
                    run2 = false;
                }else if (연산자.equals("*")) {
                    BigDecimal 곱셈 = num1.multiply(num2);
                    System.out.printf("곱셈 결과: %s\n" , 곱셈);
                    num3 = num1.multiply(num2);
                    run2 = false;
                }else if (연산자.equals("/")) {
                    BigDecimal 나눗셈 = num1.divide(num2);
                    System.out.printf("나눗셈 결과: %s\n" , 나눗셈);
                    num3 = num1.divide(num2);
                    run2 = false;
                }else{
                    System.out.println("연산자는 \"+, -, *, /\"로만 입력해주세요\n");
                    System.out.print("연산자를 입력하세요. : ");
                    연산자 = scanner.nextLine();
                    run2 = true;
                }
            } // 연산자 유효성 반복문 끝
            boolean run = true; // 계속할지 말지 묻는 변수
            while (run){ // 결과값을 계속 연산할지 말지 묻는 반복문
                System.out.print("이대로 계속 연산하시겠습니까? (Y/N) : ");
                String ctinue = scanner.nextLine();
                if(ctinue.equals("Y")){ num1 = num3; run=false;
                    System.out.println( "결과 값 : "+ num1 );
                }
                else if (ctinue.equals("N")) { //처음처럼 보이게
                    System.out.print("연산할 수를 입력하세요. : ");
                    피연산자1 = scanner.nextLine();
                    num1 = new BigDecimal(피연산자1);
                    run=false;
                }else{
                    System.out.println("Y/N 둘 중 하나만 입력하세요.");
                }


            }  // 반복문 안의 반복문 끝
        } //반복문 끝




    }


}
