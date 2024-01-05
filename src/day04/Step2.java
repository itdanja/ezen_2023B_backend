package day04;

public class Step2 { // class s
    public static void main(String[] args) { // main s

        // p.124
        // 1. 1~10까지 출력하는 코드
        System.out.print( 1 +" ");
        System.out.print( 2 +" ");
        System.out.print( 3 +" ");
        System.out.print( 4 +" ");
        System.out.print( 5 +" ");
        System.out.print( 6 +" ");
        System.out.print( 7 +" ");
        System.out.print( 8 +" ");
        System.out.print( 9 +" ");
        System.out.print( 10 +" ");
        // - for 변환
        for( int i = 1 ; i<=10 ; i++ ){ // for s
            System.out.print( i + " ");
        } // for e

        // 2. 1~100까지 합.
        int sum = 0; // 누적합계 구할려고, for 안에서도 쓰고 밖에서 쓰고
        int i = 1;
        for( i = 1 ; i<=100 ; i++ ){
            sum += i ; // vs  sum = sum + i;
        }// for end
        System.out.println(" 1~ " + (i-1) + " 합 : " + sum ); // soutv

        // 3. 구구단 : 중첩 for문 :
        for( int 단 = 2 ; 단 <=9 ; 단++ ){ // for start
            for( int 곱 = 1 ; 곱<=9 ; 곱++ ){
                //System.out.print("열/곱" + 곱 );
                //System.out.print( 단 + " X " + 곱 +" = " + (단+곱) );
                System.out.printf( "%3d X %-3d = %-3d ", 단 , 곱 , (단*곱) );
            } // for end
            //System.out.println("행/단" + 단 );
            System.out.println();
        } // for end

        // 4. (1) for -> while   1~10까지.
        int j = 1;
        while ( j<=10 ){ //  w s
            System.out.print( j + " ");
            j++;
        } // w end

        // 5. (2) for -> while 1~100까지 누적합계
        int sum2 = 0 ;
        int m = 1 ;
        while ( m<=100 ){
            sum2 += m;
            m++;
        } // w end
        System.out.println(" 1~ "+(m-1) + " 합 : "+ sum2 );

    } // main e
}// class e
    /*

                열(for2)         1      2       3       4       5
            행(for1)        2   2X1     2X2     2X3     2X4     2X5
                            3   3X1     2X2     2X3     2X4     2X5
                            4   4X1     2X2     2X3     2X4     2X5
                            5   5X1     2X2     2X3     2X4     2X5

     */

