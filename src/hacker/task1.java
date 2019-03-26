package hacker;
import java.util.*;
public class task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
			int n=sc.nextInt();
			int r=3;
			int c=0;
			while(r<=n)
			{
				r=r*2+1;
				c=c+1;
			}
			System.out.println(c);
			t--;
		}

	}

}
