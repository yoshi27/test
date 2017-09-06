import java.util.*;

public class Nabeatsu {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int m = Integer.parseInt(str);

        for(int i = 1; i <= m; i++){
            String out = "";
            String n = String.valueOf(i);
            if(i % 3 == 0){
               out = "Aho";
            }else if(n.contains("3") ){
               out += "Aho";
            }
            if(out.length() == 0){
                out += i;
            }
        System.out.println(out);
        }
    }
}