public class if_else {
    public static void main(String[] args) {
    // only if statment we have
    int password=2345;
    int user_passwoed=2345;
    if(password==user_passwoed){
        System.out.println("open the gate");
    }

    //if we have two condtion if true then if block run otherwise run else block run
    int age= 8;
    if(age>18){
            System.out.println("yes Elegible for vote and he or she is :");
        }
    else{
            System.out.println("no not elegible for vote and he or she is :");
        }

    //if we have multipal condition then use the else if for multipal times
    int marks=9;
    if(marks>80){
        System.out.println("pass A++ grade excellent work");
    }
    else if(marks>60){
        System.out.println("pass with A grade very good");
    }
    else if(marks>45){
        System.out.println("pass with b grade good");
    }
    else if(marks>33){
        System.out.println("pass with c grade but work more");
    }
    else{
        System.out.println("Fail batter luck next time");
    }
    
    
    //tarnary operator ?:true:false
    int x=7;
    String result;
    result = x%2==0 ?"this is a even number":"this is a odd number";
    System.out.println(result);
}
}
