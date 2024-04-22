package Interface.question2;

 interface Animal {
     void speak();
}
class Dog implements Animal{
     public void speak(){
         System.out.println("Dog is barking");
     }
}
