package xiaowan;
import java.util.Scanner;
public class InputScore {
    DelScore del=new DelScore();
    public void inputscore(){
        System.out.println("请输入评委数(至少要有三位)：");
        Scanner read=new Scanner(System.in);
        int count=read.nextInt();
        System.out.println("请输入各评委的分数：");
        double [] a=new double[count];
        for (int i=0;i<count;i++) {
            a[i]=read.nextDouble();
        }
        del.deDelete(a);
    }


}
