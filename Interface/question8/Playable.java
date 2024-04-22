package Interface.question8;

 interface Playable {
     void play();
}
class FootBall implements Playable{
     public void play(){
         System.out.println("Playing score");
     }
}
class VolleyBall implements Playable{
    public void play(){
        System.out.println("Playing volley!");
    }
}
class BasketBall implements Playable{
     public void play(){
         System.out.println("Playing basketball");
     }

}
