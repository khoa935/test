package kl;
import java.util.*;
public class Lhđ {
	void congtrunhanchia() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("nhap a:");
    	int a=sc.nextInt();
    	System.out.println("nhap b:");
    	int b=sc.nextInt();
    	System.out.println("+,-,*,/:");
    	char ope=sc.next().charAt(0);
    	switch(ope) {
    	    case '+':
    	    	System.out.print(a+b);
    	    	break;
    	    case '-':
    	    	System.out.print(a-b);
    	    	break;
    	    case '*':
    	    	System.out.print(a*b);
    	    	break;
    	    case '/':
    	    	System.out.print(a/b);
    	    	break;
    	}
    	sc.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lhđ m=new Lhđ();
        m.congtrunhanchia();
	}

}
