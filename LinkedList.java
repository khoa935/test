package namedpackage;
import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
	Node(int x,Node t){
		data=x;
		next=t;
	}
}
public class LinkedList{
	Node head;
    //void nhap() {
    	//Scanner sc=new Scanner(System.in);
    	//System.out.println("nhap ptu:");
    	//int x=sc.nextInt();
    	//Node newnode=new Node(x);
    	//sc.close();
    //}
    void inlienketvong(int x) {
    	Node newnode=new Node(x);
        if(head==null) {
        	head=newnode;
        }else {
        	Node temp;
        	temp=head;
        	
        	while(temp.next!=null) {
        		System.out.print(temp.data+"-->");
        		temp=temp.next;
        	}
        	if(temp.next==null) {
        		temp.next=head;
        		
        	}
        	System.out.print("NULL");
        }
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList L=new LinkedList();
         L.inlienketvong(9);L.inlienketvong(3);
         
        
	}

}
