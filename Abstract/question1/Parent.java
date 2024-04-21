package Abstract.question1;

abstract class Parent {
    abstract void message();
}
class FirstSubclass extends Parent{
    void message(){
        System.out.println("This is First subclass");
    }
}

