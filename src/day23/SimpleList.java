package day23;

public class SimpleList< E > {
    // 1. 필드
    private Object[] array;
    private int size; // 0
    // 2. 생성자
    public SimpleList(){  array = new Object[0]; }
    // 3. 메소드
        // 1. 삽입 메소드 add 함수
    public boolean add( E element  ){
        // 1. 배열의 사이즈 증가.
        this.size++;
        // 2. 배열 길이의 마지막인덱스의 매개변수 저장
        // 배열의 메모리 재할당 해서 가변길이 만들기.
        // 1. 현재 size 만큼 배열 선언
        Object[] newArray = new Object[size];
        // 2. 배열 복사 : 기존 배열에 있던 객체들을 새로운 배열에 저장.
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = array[i];
        }
        // 3. 기존배열필드에 새로운배열 대입
        array = newArray;
        // 4. 마지막인덱스의 매개변수 대입
        array[this.size - 1] = element; // 자동형변환
        return true;
    }
        // 2. 특정 요소 호출 메소드 get함수
    public E get( int index ){
        return (E)this.array[index]; // 강제형변환
    }
        // 3. 삭제 메소드
        // 4. toString 메소드
}
