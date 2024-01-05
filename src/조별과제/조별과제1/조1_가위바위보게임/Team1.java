package 조별과제.조별과제1.조1_가위바위보게임; //패키지

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Team1 {// class start
    public static void main(String[] args) {// main start
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int 플레이어승리수=0; int 컴퓨터승리수=0;
        //반복문
        while (true){// while start
            System.out.print("가위바위보 혹은 X를 입력해 주세요");
            String 플레이어 = scanner.next();
            String 컴퓨터= String.valueOf(random.nextInt(3));
            int comNum=0; int playerNum= 0;// 가위바위보를 계산을 위한 대체숫자

            if (플레이어.equals("x") || 플레이어.equals("X")) { //if start
                System.out.println("플레이어 승리수: "+ 플레이어승리수);
                System.out.println("컴퓨터 승리수: "+ 컴퓨터승리수);
                플레이어승리수=0; 컴퓨터승리수=0;

            }else if(플레이어.equals("가위")||플레이어.equals("바위")||플레이어.equals("보")){
                //문자를 숫자로 변환 (가위바위보 계산을 위해서)
                if (플레이어.equals("가위")){
                    playerNum=0;
                }else if(플레이어.equals("바위")){
                    playerNum=1;
                }else if(플레이어.equals("보")){
                    playerNum=2;
                }

                //System.out.println(playerNum);
                if (컴퓨터.equals("0")){
                    comNum=0; 컴퓨터="가위";
                }else if(컴퓨터.equals("1")){
                    comNum=1; 컴퓨터="바위";
                }else if(컴퓨터.equals("2")){
                    comNum=2; 컴퓨터="보";
                }

                //System.out.println(comNum);
                if(playerNum==(comNum+1)%3){
                    System.out.printf("플레이어:%s\n컴퓨터:%s\n",플레이어,컴퓨터);
                    플레이어승리수++;
                }else if(playerNum==comNum){
                    System.out.printf("플레이어:%s\n컴퓨터:%s\n",플레이어,컴퓨터);
                    System.out.println("무승부");
                }else{
                    System.out.printf("플레이어:%s\n컴퓨터:%s\n",플레이어,컴퓨터);
                    컴퓨터승리수++;
                }
                System.out.printf("플레이어 승리수 = %d  컴퓨터 승리수 = %d \n" ,플레이어승리수,컴퓨터승리수);
            } else {
                System.out.println("가위 바위 보 중에서 입력해주세요");
            }
        }// while end
    }//main end
}// class end


//System.out.println("컴퓨터 = " + 컴퓨터);} String 컴퓨터= String.valueOf((int)random.nextInt(3));