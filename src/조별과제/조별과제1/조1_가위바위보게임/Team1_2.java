package 조별과제.조별과제1.조1_가위바위보게임; //패키지

import java.util.Random;
import java.util.Scanner;

public class Team1_2 {// class start
    public static void main(String[] args) {// main start
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int[] 승리수 = new int[2];
        String[] 플레이어 = new String[2];
        //반복문
        while (true){// while start
            System.out.print("가위바위보 혹은 X를 입력해 주세요");
            플레이어[0] = scanner.next();
            플레이어[1]= String.valueOf(random.nextInt(3));
            int[] num = new int[2];// 가위바위보를 계산을 위한 대체숫자

            if (플레이어[0].equals("x") || 플레이어[0].equals("X")) { //if start
                System.out.println("플레이어 승리수: "+ 승리수[0]);
                System.out.println("컴퓨터 승리수: "+ 승리수[1]);
                승리수[0]=0; 승리수[1]=0;

            }else if(플레이어[0].equals("가위")||플레이어[0].equals("바위")||플레이어[0].equals("보")){
                //문자를 숫자로 변환 (가위바위보 계산을 위해서)
                if (플레이어[0].equals("가위")){
                    num[0]=0;
                }else if(플레이어[0].equals("바위")){
                    num[0]=1;
                }else if(플레이어[0].equals("보")){
                    num[0]=2;
                }

                //System.out.println(playerNum);
                if (플레이어[1].equals("0")){
                    num[1]=0; 플레이어[1]="가위";
                }else if(플레이어[1].equals("1")){
                    num[1]=1; 플레이어[1]="바위";
                }else if(플레이어[1].equals("2")){
                    num[1]=2; 플레이어[1]="보";
                }

                //System.out.println(comNum);
                if(num[0]==(num[1]+1)%3){
                    승리수[0]++;
                }else if(num[0]==num[1]){

                }else{
                    승리수[1]++;
                }
                System.out.printf("플레이어:%s\n컴퓨터:%s\n",플레이어[0],플레이어[1]);
                System.out.printf("플레이어 승리수 = %d  컴퓨터 승리수 = %d \n" ,승리수[0],승리수[1]);
            } else {
                System.out.println("가위 바위 보 중에서 입력해주세요");
            }
        }// while end
    }//main end
}// class end


//System.out.println("컴퓨터 = " + 컴퓨터);} String 컴퓨터= String.valueOf((int)random.nextInt(3));