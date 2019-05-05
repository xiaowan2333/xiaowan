package xiaowan;

public class Example5_7 {
    public static void main (String [] args){
        Average aver=new Average();
        aver.n=100;
        float resultOne=aver.f();
        float resultTwo=aver.g();
        System.out.println("resultOne="+resultOne);
        System.out.println("resultTwo="+resultTwo);
    }
}
