package 조별과제.조별과제2.팀과제2_2조.팀과제2;

import java.util.Calendar;
import java.util.Scanner;

public class 팀과제 {//class start
    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);

        서비스형태 Basic = new 서비스형태("Basic","1TB","2",10000);
        서비스형태 Standard = new 서비스형태("Standard","2TB","3",11000);
        서비스형태 Premiunm = new 서비스형태("Premiunm","3TB","4",12000);

        서비스형태[] 서비스형태배열 = new 서비스형태[]{Basic,Standard,Premiunm};

        Client[] client=new Client[0];
        int count=0;
        //client[0]=new Client("admin", "1234");

        Client currentC=new Client(null,null);

        //test
        /*for(int i=0; i<서비스형태배열.length; i++){//for start
            System.out.println(서비스형태배열[i].이름);
        }//for end*/

        while(true) {//프로그램 시작
            while (true) {//로그인 페이지
                System.out.println("1.회원가입 | 2. 로그인");
                System.out.print("선택 > ");
                String enter = scanner.nextLine();

                //회원가입
                if (enter.equals("1")) {
                    boolean checkId = true;   //유효성 검사 결과 출력 변수

                    //입력
                    System.out.print("생성할 id : ");
                    String newId = scanner.nextLine();
                    System.out.print("생성할 pass : ");
                    String newPass = scanner.nextLine();

                    //생성할 아이디 유효성검사
                    for (int i = 0; i < client.length; i++) {//for start
                        if (client[i] == null) {//if start
                                break;
                        }
                        if (newId.equals(client[i].id)) {
                            System.out.println("아이디가 존재합니다.");
                            checkId = false;
                        }//if end
                    }//for end

                    //회원 등록
                    if (checkId) {//if start
                        count++;    //배열 길이 추가
                        Client[] temp=new Client[count];    //스왑용 배열 생성

                        //배열 스왑
                        for(int i=0; i<client.length; i++){
                            temp[i]=client[i];
                        }

                        //기존 배열 길이 +1로 새로 선언
                        client=new Client[count];

                        //스왑 -> 기존 배열로 데이터 이동
                        for(int z=0; z<temp.length; z++){
                            client[z]=temp[z];
                        }

                        //새로운 회원 정보 대입
                        for (int j = 0; j < client.length; j++) {//for start
                            if (client[j] == null) {//if start
                                client[j] = new Client(newId, newPass);
                                break;
                            }//if end (client[j]==null)
                        }//for end
                        System.out.println("계정이 생성되었습니다.");
                    }//if end (checkId)

                    //회원정보 확인(test)
                    /*for (int z = 0; z < client.length; z++) {
                        if (client[z] == null) {
                            break;
                        }
                        System.out.printf("%8s%8s\n", client[z].id, client[z].pw);
                    }*/

                }//if end

                //로그인
                else if (enter.equals("2")) {
                    boolean back=false;

                    while(true) {//아이디가 일치하지 않을경우 다시 로그인을 받기위한 while
                        boolean checkLogin = false;   //로그인 유효성검사 결과 출력 변수

                        //입력
                        System.out.print("id : ");
                        String id = scanner.nextLine();
                        System.out.print("pass : ");
                        String pw = scanner.nextLine();

                        //로그인 유효성검사(아이디, 비번 일치 여부 판별)
                        for (int i = 0; i < client.length; i++) {//로그인
                            if (client[i] == null) {//if start
                                break;
                            }
                            if (id.equals(client[i].id) && pw.equals(client[i].pw)) {
                                checkLogin = true;
                                currentC = client[i];
                                break;
                            }//if end
                        }//for end

                        //로그인 성공
                        if (checkLogin) {//if start
                            System.out.println("★로그인 성공★");
                            break;
                        }//if end
                        else {
                            System.out.println("다시 입력하시겠습니까? 1.예 | 2.아니오");
                            System.out.print("선택 > ");
                            String reLog=scanner.nextLine();

                            if(reLog.equals("2")){
                                back=true;
                                break;
                            }//if end
                        }//else end
                    }//while end

                    if(back){
                        continue;
                    }
                    break;

                }//else if end

                //입력값 유효하지 않을 경우
                else {
                    System.out.println("올바르지 않은 입력입니다.");
                }//else if end

            }//while end

            while (true) {//while start : 마이페이지
                //현재 사용자에 대한 정보 id로 비교해 배열에 넣기(수정정보 갱신)
                for (int i = 0; i < client.length; i++) {
                    if (currentC.id == client[i].id) {
                        client[i] = currentC;
                        break;
                    }
                }

                //입력
                System.out.println("1.구독신청 | 2.사용현황 | 3.기간연장 | 4.로그아웃");
                System.out.print("선택 > ");
                String sCategory = scanner.nextLine();

                if (sCategory.equals("1")) {//1.구독신청 선택
                    System.out.println("1.Basic | 2.Standard | 3.Premiun");
                    System.out.print("선택 > ");
                    String sType = scanner.nextLine();
                    int iType=Integer.parseInt(sType);

                    if ( iType <= 서비스형태배열.length) {
                        System.out.println("선택한 서비스 : " + 서비스형태배열[iType - 1].이름);
                        System.out.println("금액 : " + 서비스형태배열[iType - 1].금액);

                        //구독 동의여부 출력
                        System.out.println("구독하시겠습니까? (yes/no 로 답변 해 주십시오.)");
                        System.out.print("선택 > ");
                        String strcheckSub = scanner.nextLine();
                        System.out.println(strcheckSub);

                        if (strcheckSub.equals("yes")) {//if start
                            //현재 id에 해당하는 정보 불러오기
                            currentC.서비스형태 = 서비스형태배열[iType - 1].이름;
                            currentC.구독기간 = 1;
                        } else if (strcheckSub.equals("no")) {
                            continue;
                        } else {
                            System.out.println("올바르지 않은 입력입니다.");
                        }//if end
                    }
                }//if==1 end

                else if (sCategory.equals("2")) {//2.사용현황 선택
                    System.out.println("ID : " + currentC.id);
                    System.out.println("구독기간 : " + currentC.구독기간 + "[개월]");
                    System.out.println("이용 서비스 : " + currentC.서비스형태);

                    for (int i = 0; i < 서비스형태배열.length; i++) {//for start
                        if (currentC.서비스형태 == 서비스형태배열[i].이름) {//if fstart
                            System.out.println("용량 : " + 서비스형태배열[i].용량);
                            System.out.println("사용인원 : " + 서비스형태배열[i].사용인원);
                        }//if end
                    }//for end

                }//else if end
                else if (sCategory.equals("3")) {//3. 기간연장
                    System.out.print("연장기간을 [개월] 단위로 입력 해 주십시오. : ");
                    int addMonth = scanner.nextInt();
                    scanner.nextLine();
                    int addPrice = 0; //기간연장*금액
                    for (int i = 0; i < 서비스형태배열.length; i++) {//for start
                        if (currentC.서비스형태 == 서비스형태배열[i].이름) {//if fstart
                            addPrice = addMonth * 서비스형태배열[i].금액;
                            break;
                        }//if end
                    }//for end
                    System.out.printf("지불할 금액은 %d 입니다.\n", addPrice);
                    System.out.print("기간연장을 하시겠습니까?(yes/no 로 답변 해 주십시오.)");
                    String addCheck = scanner.nextLine();

                    if (addCheck.equals("yes")) {//if start
                        currentC.구독기간 += addMonth;
                        System.out.printf("구독기간이 %d[개월]로 연장되었습니다.\n", currentC.구독기간);
                    } else if (addCheck.equals("no")) {
                        continue;
                    } else {
                        System.out.println("올바르지 않은 입력입니다.");
                    }//if end

                }//else if end
                else if (sCategory.equals("4")) {
                    System.out.println("로그아웃하시겠습니까? 1.확인 | 2.취소");
                    System.out.print("선택 > ");
                    String checkOut = scanner.nextLine();
                    if (checkOut.equals("1")) {
                        System.out.println("로그아웃 되었습니다.");
                        break;
                    } else if (checkOut.equals("2")) {
                        System.out.println("취소선택");
                    } else {
                        System.out.println("유효하지 않은 입력입니다.");
                    }
                }//else if end
                else{
                    System.out.println("올바르지 않은 입력입니다.");
                }//else end

            }//while end
        }//while end(프로그램 끝)
        
    }//main end
}//class end
