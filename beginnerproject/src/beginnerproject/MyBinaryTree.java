package beginnerproject;
class TNode{
	int data;
    TNode left;TNode right;
	TNode(int x){
		data=x;
		left=right=null;
	}
	TNode(int x,TNode ll,TNode rr){
		data=x;
		left=rr;
		right=rr;
	}
}
public class MyBinaryTree {
	 TNode root;
	 MyBinaryTree(){
		 
	 }
void taocayT() {
		 TNode A=new TNode(7,new TNode(1),new TNode(6));
		 TNode B=new TNode(5,null,new TNode(9));
		 root=new TNode(2,A,B);
	 }
     void duyet1(TNode T) {
    	 if(T!=null) {
    		 System.out.print(""+T.data);
    		 duyet1(T.left);
    		 duyet1(T.right);
    	 }
     }
     void duyettientu() {
    	 System.out.print("tien tu:");
    	 duyet1(root);
    	 
     }
     void duyet2(TNode T) {
    	 if(T!=null) {
    		 System.out.print(""+T.data);
    		 duyet2(T.left);
    		 duyet2(T.right);
    	 }
     }
     void duyettrungtu() {
    	 System.out.print("\ntrung tu:");
    	 duyet2(root);
     }
     void duyet3(TNode T) {
    	 if(T!=null) {
    		 System.out.print(""+T.data);
    		 duyet3(T.left);
    		 duyet3(T.right);
    	 }
     }
     void duyethautu() {
    	 System.out.print("\nhau tu:");
    	 duyet3(root);
     }
     int sonot(TNode T) {
    	 if(T==null) {
    		 return 0;
    	 }else {
    		 return 1+sonot(T.left)+sonot(T.right);
    	 }
     }
     int sn() {
    	 return sonot(root);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinaryTree T=new MyBinaryTree();
		T.taocayT();
		T.duyettientu();
		T.duyettrungtu();
		T.duyethautu();
		System.out.print("\nso not trong cay la:"+T.sn());
         System.out.print("\nxong");
	}

}
