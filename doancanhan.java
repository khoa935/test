package namedpackage;
import java.util.Scanner;
import java.util.ArrayList;
abstract class Book{
	double defaultprice=100;
	String title;
	String author;
    String genre;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	Book(){
	}
	public Book(String title, String author, String genre) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
    void input() {
        Scanner obj=new Scanner(System.in);
    	System.out.println("title:");
    	title=obj.nextLine();
    	System.out.println("author:");
    	author=obj.nextLine();
    	System.out.println("genre:");
    	genre=obj.nextLine();
    	obj.close();
    }
    void output() {
    	System.out.println("title:"+title);
    	System.out.println("author:"+author);
    	System.out.println("genre:"+genre);
    }
    abstract double calculateprice();
}
class entertainmentbook extends Book {
	String state;
	public entertainmentbook() {
	}
	public entertainmentbook(String title, String author, String genre,String state) {
		super(title, author, genre);
		this.state=state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	void input() {
		Scanner obj=new Scanner(System.in);
		super.input();
		System.out.println("state:");
		state=obj.nextLine();
		obj.close();
	}
	void output() {
		super.output();
		System.out.println("state:"+state);
	}
	double calculateprice() {
		if(state=="new") {
			return 100*2.5;
		}else if(state=="old"){
			return 100*2;
		}
		return 0;
	}
}
class educationbook extends Book{
	String state;
	public educationbook() {
	}

	public educationbook(String title, String author, String genre,String state) {
		super(title, author, genre);
		this.state=state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    void input() {
    	Scanner obj=new Scanner(System.in);
    	super.input();
    	System.out.println("state:");
    	state=obj.nextLine();
    	obj.close();
    }
    void output() {
    	super.output();
    	System.out.println("state:"+state);
    }
	double calculateprice() {
		if(state=="new") {
			return 100*3;
		}else if(state=="old") {
			return 100*2;
		}
		return 0;
	}
}
class bookmanager{
	ArrayList<Object>list=new ArrayList<>();
	  void returnbook() {
		  Scanner obj=new Scanner(System.in);
				int choice2;
				System.out.println("1.entertainment book");
				System.out.println("2.education book");
				System.out.println();
				choice2=obj.nextInt();
				if(choice2==1) {
					for(int i=0;i<=list.size();i++) {
						entertainmentbook e=new entertainmentbook();
						e.input();
						list.add(e);
					}
					}else if(choice2==2) {
						for(int i=0;i<=list.size();i++) {
							educationbook d=new educationbook();
							d.input();
							list.add(d);
						}
					}
				obj.close();
	  }
	   void borrowbook() {
			  Scanner obj=new Scanner(System.in);
				int choice3;
				System.out.println("1.entertainment book");
				System.out.println("2.education book");
				System.out.println();
				choice3=obj.nextInt();
				if(choice3==1) {
					for(int i=0;i<=list.size();i++) {
						entertainmentbook e=new entertainmentbook();
						e.output();
	                    list.remove(e);
					}
				}else if(choice3==2) {
					for(int i=0;i<=list.size();i++) {
					    	educationbook d=new educationbook();
					    	d.output();
					    	list.remove(d);
					    }
				    }
				obj.close();
				}
			
			}   
public class doancanhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookmanager b=new bookmanager();
		   b.returnbook();
		   b.borrowbook();
	}

}
