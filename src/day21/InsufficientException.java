package day21;

public class InsufficientException extends Exception {
                            // extends 상속 키워드
    // 예외 클래스 만들기
    // 1. Exception 클래스로 부터 상속 받는다.
    // 2. 생성자에 super( message ); 작성한다.

    public InsufficientException( ){ }

    public InsufficientException( String message ){
        super( message ); // super : 상위 객체 vs this : 본인 객체
        /*
                        super       vs          this
            필드            x                     this.필드명
            생성자       super( )                 x
            메소드       super.메소드명( )         x
         */
    }
}
