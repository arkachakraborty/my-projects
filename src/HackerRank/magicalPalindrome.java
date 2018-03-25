package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class magicalPalindrome {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String fullString=sc.nextLine();
		//System.out.println(fullString);
		ArrayList<Character> cl=new ArrayList<Character>();
		int temp=fullString.length();
		int pointer=0;
		for(int i=pointer;i<fullString.length();i++){
			if(fullString.charAt(i)==fullString.charAt(temp-1)){
				cl.add(fullString.charAt(i));
				pointer++;
			}
			else{
				temp--;
				i=pointer;
			}
		}
		System.out.println(cl);
	}
}
