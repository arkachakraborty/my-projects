package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class bal {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		ArrayList<String> sl=new ArrayList<String>();
		for(int i=0;i<n+1;i++){
			sl.add(sc.nextLine());
		}
		//System.out.println(sl);
		/*for(int i=1;i<sl.size();i++){
			System.out.println(sl.get(i));
		}*/
		int count=0;
		for(int j=1;j<sl.size()-1;j++){
			for(int k=j+1;k<sl.size();k++){
				String a=sl.get(j);
				String a1=Character.toString(a.charAt(a.length()-1));
				String b=sl.get(k);
				String b1=Character.toString(b.charAt(b.length()-1));
				int a2=Integer.parseInt(a1);
				int b2=Integer.parseInt(b1);
				if(b2-a2==d){
					if(a.charAt(0)==b.charAt(2)&& a.charAt(2)==b.charAt(0)){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
