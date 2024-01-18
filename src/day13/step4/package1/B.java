package day13.step4.package1;

// package1 폴더
public class B {
    public void method(){
        // -같은 패키지 이니까 가능.
        A a = new A();
        a.field = "value";
        a.method();
    }
}
