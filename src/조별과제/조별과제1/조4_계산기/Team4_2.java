package 조별과제.조별과제1.조4_계산기;

import java.math.BigDecimal;
import java.util.Scanner;

public class Team4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = new String[3];
        boolean run = true;
        char temp;

        while(run){

            boolean pass= true;

            System.out.println("숫자를 입력하세요");
            num[0] = scanner.nextLine();

            for(int i=0; i<num[0].length();i++){
                temp = num[0].charAt(i);
                if(temp>= 48 && temp <=57){
                    num[0]=num[0];
                }else{
                    System.out.println("숫자아님");
                    pass = !pass;
                }

            }
            if(!pass){continue;}

            System.out.println("연산자 입력 :");
            num[1] = scanner.nextLine();

            System.out.println("숫자를 입력하세요");
            num[2] = scanner.nextLine();

            for(int i=0; i<num[2].length();i++){
                temp = num[2].charAt(i);
                if(temp>= 48 && temp <=57){
                    num[2]=num[2];
                }else{
                    System.out.println("숫자아님");
                    pass = !pass;
                }

            }
            if(!pass){continue;}

            if(num[1].equals("+")){
                System.out.printf("%.5f\n",Double.parseDouble(num[0])+Double.parseDouble(num[2]));
            } else if (num[1].equals("-")) {
                System.out.printf("%.5f\n",Double.parseDouble(num[0])-Double.parseDouble(num[2]));
            }else if (num[1].equals("*")){
                System.out.printf("%.5f\n",Double.parseDouble(num[0])*Double.parseDouble(num[2]));
            }else if (num[1].equals("/")){
                System.out.printf("%.5f\n",Double.parseDouble(num[0])/Double.parseDouble(num[2]));
            }else {
                System.out.println("연산자가 잘못 입력 되었습니다.");
                pass=!pass;
            }
            if( !pass ){ continue; }


        }
    }

}
