import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n*3];
	    int b=0,c=0,d=0;
	    for(int i=0;i<n*3;i++){
	        a[n]=sc.nextInt();
	    }
	    for(int i=0;i<n*3;i+=3){
	        b=b+a[i];
	        c=c+a[i+1];
	        d=d+a[i+2];
	    }
	    if(b==0 && c==0 && d==0){
	        System.out.println("YES");
	    }
	    else{
	        System.out.println("NO");
	    }
	    
	}
}
