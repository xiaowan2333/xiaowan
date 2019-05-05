package xiaowan;

public class Example5_1 {
    public static void main(String [] args){
        Student zhang=new Student();
        zhang.age=17;        //访问继承的 成员变量
        zhang.number=100101;
        zhang.showPeopleMess();//调用继承的方法
        zhang.tellNumber();
        int x=9 ,y=29;
        System.out.print("会做加法");
        int result=zhang.add(x,y);
        System.out.printf("%d+%d=%d\n",x,y,result);
        UniverStudent geng=new UniverStudent();
        geng.age=21;
        geng.number=6609;
        geng.showPeopleMess();
        geng.tellNumber();
        System.out.print("会做加法：");
        result=geng.add(x,y);
        System.out.printf("%d+%d=%d\n",x,y,result);
        System.out.print("会做乘法");
        result=geng.multi(x,y);
        System.out.printf("%d×%d=%d\n",x,y,result);
        boolean w;
        w=zhang instanceof UniverStudent;
        System.out.println(w);
        w=zhang instanceof Student;
        System.out.println(w);

    }
}
