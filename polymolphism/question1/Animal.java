package polymolphism.question1;

public class Animal {
    void sounds(){
        System.out.println("Animal sounds");
    }
}
class Bird extends Animal {
    @Override
    void sounds() {
        System.out.println("Birds chirps");
    }
}
class Cat extends Animal {
    @Override
    void sounds(){
        System.out.println("Cats moue");
    }

}