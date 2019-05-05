package xiaowan;

public class ComputerAver {
    public void giveAver(double [] b){
        double sum=0;
        for (int i=0;i<b.length;i++){
            sum+=b[i];
        }
        sum=sum/b.length;
        System.out.println();
        System.out.println("最终平均分为："+sum);
    }
}
