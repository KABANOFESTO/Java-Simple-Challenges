package Interface.question3;

interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Spacecraft flies in the universe");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Airplane used mainly in transportation of People and Goods");
    }
}
class Helicopter implements Flyable{
    public void fly_obj() {
        System.out.println("Helicopter has the scatters");
    }
}