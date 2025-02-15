public class break_continue {
    public static void main(String[] args) {
        //break is a tarminate the loop when codition is true
        // and continue is skip the itration and move to the next itration

        for(int num=0;num<100;num++){
            if(num==50){
                System.out.println("break condition is true so tarminate the loop");
                break ;
            }
            if(num==10 || num==20||num==30){
                System.out.println("continue conditioin is true skip the loop so number is not print");
                continue;
            }
            System.out.println(num);
        }
    }
}
