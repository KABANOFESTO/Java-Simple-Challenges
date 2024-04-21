package Abstract.question3;

abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks{
   private  double sub1,sub2,sub3;
   A(double sub1,double sub2,double sub3){
       this.sub1 = sub1;
       this.sub2 = sub2;
       this.sub3 = sub3;
   }
    double getPercentage(){
       return (sub1+sub2+sub3)/3.0;
    }
}
class B extends Marks{
    private double sub1,sub2,sub3,sub4;
    B(double sub1,double sub2,double sub3,double sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
    double getPercentage(){
        return (sub1+sub2+sub3+sub4)/4.0;
    }
}
