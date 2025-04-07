package namedpackage;
import java.util.Scanner;
//import java.util.Vector;
import java.io.*;
//import java.util.Date;
import java.util.Arrays;
import java.util.ArrayList;

public class baitapvenha {
TNode root;	
class TNode{
		TNode left;TNode right;int data;
		TNode(int x){
			data=x;
	        left=null;
	        right=null;
		}
	}
int nhap() {
	 root = null;
	if(root==null) {
		int x=0;
		root=new TNode(x);
	}
		Scanner sc=new Scanner(System.in);
			System.out.println("nhap x:");
			int x=sc.nextInt();
			if(x==0) {
				return 0;
			}else {
				TNode parent=root;
				if(x<root.data) {
					parent.left=TNode(x);
				}else {
					parent.right=TNode(x);
				}
			}
	return 0;
}

	public static void main(String[] args)throws IOException {
			baitapvenha n=new baitapvenha();
			n.nhap();
		
	}
}
	

