package Abstract.question5;

abstract class Animals {
    abstract void cats();
    abstract void dogs();

}
class Cats extends Animals {
    void cats() {
        System.out.println("Cats meow");
    }
    void dogs(){

    }
}
class  Dogs extends Animals{
    void cats(){

    }
    void dogs(){
        System.out.println("Dogs Bark");
    }
}

