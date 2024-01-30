package day21;

public class Step2 {
    public static void main(String[] args) {

        // 1.객체
        Account account = new Account();

        // 2. 메소드 호출
        account.deposit( 10000 );
        System.out.println("account = " + account);

        // 3. 메소드 호출
        try {
            account.withdraw(30000);
        }catch ( InsufficientException e ){
            System.out.println("e = " + e);
        }

    }
}
