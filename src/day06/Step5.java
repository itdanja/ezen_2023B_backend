package day06;

import java.util.Scanner;

public class Step5 { // class c

    public static void main(String[] args) { // ms

        // 2. 시간과 초를 입력받아 시간에 초를 더한 시간을 출력하시오.
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 시간(hhmmss형식) : ");
        String time = scanner.nextLine();
        System.out.print(" 시간(숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        // 입력받은 time 에서 second 만큼 지난 시간을 hh:mm:ss형식으로 출력
        System.out.println("result = " + result);
        /*
            예]
                time = 145930
                second = 70
                    result = 15:00:40
         */
    }// me
} // class e
