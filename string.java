public class string {
    public static void main(String[] args) {

        String s1="Hello shivanshu tiwari ";  //stored id string pool
        String s2= new String("Hello"); //heap memory created 
        System.out.println(s2);
        System.out.println(s1);

        //String length
        System.out.println(s2.length());
        // trim is used to remove all the space
        System.out.println(s2.trim());
        //slice method is a gives us substring
        System.out.println(s1.substring(2,6));
        //we can check which char startwith("") 
        System.out.println(s1.startsWith("He"));
        // we can check which char endwith true or false
        System.out.println(s2.endsWith("lo"));
        //concat meens add two string useing + operator
        System.out.println(s1 + s2);
        //useing concat method
        System.out.println(s2.concat(s1));
        //toUppercase used to all aalphabet capital size
        System.out.println(s1.toUpperCase());
        //toLowercase used to all alphabate lower size
        System.out.println(s2.toLowerCase());
        // replace is used to recplace new alphabate with old alphabate
        System.out.println(s1.replace("l","w"));
        // reaplace all is used to replace all new sub string to a old substring 
        System.out.println(s1.replaceAll("hello","olleh"));
        // rrepeat the all string in given times
        System.out.println(s1.repeat(5));
        //compare to two string
        System.out.println(s2.compareTo(s1));
        //comparetoIgnorease campare without campare lower to upper all the same
        System.out.println(s1.compareToIgnoreCase(s2));
        //check this is a equals or not without casesensitve
        System.out.println(s2.equalsIgnoreCase("hello"));
        //check with lpwer case and uppercase 
        System.out.println(s1.equals(s2));
        // check this is an empty or not 
        System.out.println(s1.isEmpty());
        // give the index number where char is exsit
        System.out.println(s2.indexOf("l"));
        // give the number how many times char is stored in our string
        System.out.println(s1.contains("s"));
        System.out.println(s2.valueOf(4));
        
    }
    
}
