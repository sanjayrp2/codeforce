import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int count=0;
		for(int i=1;i<s.length();i++){
		    if(s.charAt(i-1)==s.charAt(i)){
		        count++;
		    }
		}
		System.out.print(count);
	}
}
