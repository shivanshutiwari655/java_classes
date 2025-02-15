public class loop {
    public static void main(String[] args) {
        // int i=0;
        // for(i=1;i<10;i++){
        //     System.out.println(i);
        // }

        // //while loop check the condition first if condition is true then run the block of code
        // System.out.println("now while loop");
        // int num=0;
        // while(num<10){
        //     System.out.println(num);
        //     num++;
        // }

        // // do while loop is a same as while loop but first run once then check the condition that meens if false run atlest once
        // System.out.println("this is a do while loop example");
        // int num1=0;
        // do{
        //     System.out.println(num1);
        //     num1++;
        // }while(num1<20);
        int i=1;
        for(;i<10;){
            System.out.println("day  "+ i);
            for(int j=1;j<24;j++){
                System.out.println("houres "+ j +" To - "+ (j+1));
            }
            i+=1;
        }
    }
}
