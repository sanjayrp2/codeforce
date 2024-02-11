import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=0,b=0,c=0;
	    int ai,bi,ci;
	    for(int i=0;i<n;i++){
	        ai=sc.nextInt();
	        bi=sc.nextInt();
	        ci=sc.nextInt();
	        a+=ai;
	        b+=bi;
	        c+=ci;
	    }
	     if(a==0 && b==0 && c==0){
	       System.out.print("YES");
	     }
	     else{
	            System.out.printf("NO");
	        }
	}
}
