 import java.util.*;

 public class checkevenodd{
    public static void main(String[] arg){
        int num=96;
       evenorodd(num);
    
    }
    public static void evenorodd(int num){
        if(num%2 == 0){
            System.out.print(num +" is an even number.");
        }
        else{
            System.out.print( num +" is a odd number.");
        }
    }



}