import java.io.*;
import java.util.*;

public class OhYear {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(str);
		
		FunClubID(n);
	}

	private static void FunClubID(int n) {
		// TODO 自動生成されたメソッド・スタブ
		if(n%15==0){
			System.out.println("Oh! Year!");
		}else if(n%3==0){
			System.out.println("Oh!");
		}else if(n%5==0){
			System.out.println("Year!");
		}
	} 

}
