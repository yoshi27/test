import java.util.*;

public class Test {

    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            //受け取った文字をそのまま出力する。
            returnStr(line);
        
            int n = Integer.parseInt(line);
            //受け取った数値までの和を出力する。
            sumNum(n);
            
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }

	public static void returnStr(String str){
	    System.out.println(str);
	}

	public static void sumNum(int n){
	    int m = 0;
	    
	    if(n <= 0){
	        System.out.println("ERROR");
	        return;
	    }
	    for(int i = 1; i <= n; i++){
	        m += i;
	    }
	    System.out.println(m);
	}

}