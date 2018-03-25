package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n=s.length();
        
	    if(n>0 && n<1001){    
        	char arr[]=new char[n];
	        arr=s.toCharArray();
	        int count=0;
        
	        ArrayList<Character> cl=new ArrayList();
	        ArrayList<Integer> is=new ArrayList();
	        ArrayList<Integer> js=new ArrayList();

	        //Set<Integer> is=new TreeSet<Integer>();
	
	        
	        for(int i=0;i<arr.length;i++){
	        	cl.add(arr[i]);
	        	}
	        //System.out.println(cl.size());
	        outer_loop:
	        for(int i=0;i<arr.length-1;i++)
	        {
	        	inner_loop:
	        	for(int j=i+1;j<arr.length;j++)
	        	{
		        		if(!js.contains(j))
		        		{	
	        				if(cl.get(i)==cl.get(j))
			        		{
			        			is.add(i);
			        			js.add(j);
			        		}
		        		}
	        	}
	        }
	        //System.out.println("ola");
	       // System.out.println(is.size());
	        int rem=0;
	        //Collections.sort(is);
	        
	        for(int i=0;i<is.size();i++){
	        	System.out.println(is.get(i));
	        }
	        
	        /*for(int i=0;i<is.size();i++){
		        rem=is.get(i);
		        if(rem==0){
		        	cl.remove(rem);
		        }
		        else{
		        	rem=rem-i;
		        	cl.remove(rem);
		        }
	        }
	        
	        if(cl.size()>0){
		        for(int i=0;i<cl.size();i++){
		        	System.out.print(cl.get(i));
		        }
	        }
	        else{
	        	System.out.println("Empty String");
	        }*/
	    }
	    else
	    	System.out.println("enter valid string");
    }
}
