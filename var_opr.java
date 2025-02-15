public class var_opr {
    public static void main(String[] args) {
        // variable is a name of memory location where our value is stored 
        // If we are use the variable first define the type of data like int,float,string,boolean etc.
        String name="shivanshu tiwari";
        int age=22;
        double marks=90.8;
        boolean pass=marks>33;
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(pass);

        //type implesit conversion and the explisit casting
        byte m=127;
        int n=67;
        n=(byte) n;
        float f=4.6f;
        int result =m+n;    //type conversion implicit or type pramosion by itself
        System.out.println(result);

        //operator is a symbol that is used to excute mathamtical opration
        //aassignment operator =,+=,-=,*=,/=.
        int c=20;
        int d=10;
        c+=5;
        d-=5;
        System.out.println(c);
        System.out.println(d);
        c/=2;
        d*=2;
        System.out.println(c);
        System.out.println(d);

        //++incriment and decriment --
        //preincrement ++num  predecriment --num1
        int num=5;
        int num1=5;
        System.out.println(++num);
        System.out.println(--num1);
        System.out.println(num++);
        System.out.println(num1--);
        // postincriment num++ add value but update in next statment
        System.out.println(num);
        System.out.println(num1);

        //airtmatic oprator +,-,*,/
        int a=20;
        int b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        // comparision operator ==,<,>,<=,>= 
        int x=10;
        int y=5;
        System.out.println(x==y);
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x<=y);

        // logical operator &&and,|| or, ! not.
        System.out.println("example of logical operator");
        System.out.println(x<y && x>y);
        System.out.println(x<y || x>y);
        System.out.println(!(x==y));



    }
}
