package Abstract.question4;

abstract class abstracts {
    abstracts(){
        System.out.println("This is a constructor of abstract class.");
    }
    abstract void a_method();
    void normalMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
class A extends abstracts{
    void a_method(){
        System.out.println("This is abstract method");
    }
}