package day15;

public class Step3 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound(); //멍멍

        Cat cat = new Cat();
        cat.sound(); // 야옹

        Animal dog1 = new Dog();

        animalSound(  dog1 );
        animalSound( new Cat() );

    }
    // 매개변수 다형성
    public static void animalSound( Animal animal){
        animal.sound();
    }
}
