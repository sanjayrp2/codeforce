import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int  upper=0,lower=0;
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch>='A' && ch<='Z'){
		        upper++;
		    }
		    else{
		        lower++;
		    }
		}
		 if(upper>lower){
		        System.out.print(s.toUpperCase());
		    }
		    else{
		        System.out.println(s.toLowerCase());
		    }
	}
}
