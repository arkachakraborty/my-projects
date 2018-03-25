package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMan {

	public static void main(String[] args) throws IndexOutOfBoundsException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String fullString=sc.nextLine();
		int numbers=sc.nextInt();
		ArrayList<String> encloseList=new ArrayList<String>();
		for(int j=0;j<numbers;j++){
			encloseList.add(sc.next());
		}
		//System.out.println(fullString);
		ArrayList<String> wordList=new ArrayList<String>();
		ArrayList<Integer> indexLIst=new ArrayList<Integer>();
		ArrayList<Integer> notepointers=new ArrayList<Integer>();
		for(int c=0;c<fullString.length();c++){
			if((int)fullString.charAt(c)==32){
				//System.out.println(c);
				indexLIst.add(c);
				//System.out.println(indexLIst);
			}
		}
		int pointer=-1;
		for(int i=0;i<indexLIst.size();i++){
			String a=fullString.substring(pointer+1,indexLIst.get(i));
			wordList.add(a);
			pointer=pointer+a.length()+1;
		}
		if(pointer==fullString.length()){
		System.out.println(wordList);
			}
		else{
			wordList.add(fullString.substring(pointer+1,fullString.length()));
			System.out.println(wordList);
		}
		System.out.println(encloseList);
		for(int k=0;k<wordList.size();k++){
			
			for(int l=0;l<encloseList.size();l++){
				//System.out.println("hola");
				//System.out.println(wordList.get(k));
				//System.out.println(encloseList.get(l));
				if(wordList.get(k).compareTo(encloseList.get(l))==0){
					//System.out.println(wordList.get(k));
					notepointers.add(k);
				}
				else{
					//System.out.println(wordList.get(k));
				}
			}
			
		}
		System.out.println(notepointers);
			int flag=0;
			/*try{
			for(int p=0;p<wordList.size();p++){
				for(int o=0;o<=notepointers.size();o++){
				if(notepointers.get(o)==p){
					System.out.print("/"+wordList.get(p)+"/ ");
					break;
				
				}
				else{
					flag=1;
					 
				}
			}
				if(flag==1){
					System.out.print(wordList.get(p-1)+" ");
				}
		}
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("haha");
			}*/
			for(int check=0;check<wordList.size();check++){
				if(notepointers.contains(check)){
					System.out.print((wordList.get(check))+"/ ");
				}
				else{
					System.out.print((wordList.get(check))+" ");
				}
			}
		}

}
