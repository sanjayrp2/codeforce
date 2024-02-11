import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int upper=0,lower=0;
		for(int i=0;i<1;i++){
		    char c=s.charAt(i);
		    if(c>='A' && c<='Z'){
		        System.out.print(s);
		    }
		    else{
		        String res=s.substring(0,1).toUpperCase()+s.substring(1);
		        System.out.print(res);
		    }
		}
	}
}
