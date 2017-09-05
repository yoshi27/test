import java.io.*;
import java.util.*;

public class fizzbuzz {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        
        for(int i = 1; i <= num; i++){
            String out = "";
            if(i % 3 ==  0){
                out = "Fizz";
            }

            if(i % 5 == 0){
                out += "Buzz";
            }

            if(i % 7 == 0){
                out += "Woof";
            }

            if(out.length() == 0){
                out += i;
            }

            System.out.println(out);
        }
	} 

}
