import java.util.*;

public class fizzbuzzSum {
    public static void main(String args[]){
        int m = 0;
        
        for(int i = 0; i < 1000; i++){
            if(i % 15 == 0){
                m += i;
            }
            
            if(i % 3 == 0){
                m += i;
            }
            
            if(i % 5 == 0){
                m += i;
            }
        }
        System.out.println(m);
    
    }
}
