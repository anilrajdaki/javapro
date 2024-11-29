package assignment4;

public class _11Library {
		  String []books;
		  void toaddbooks(String[] books) {
			this.books=books;
		}
		  void toremovebooks(_11Library s,String bookname) {
			  //int count=0;
			  String []removebook= new String[s.books.length];
			  int count=0;
			  for(int i=0;i<s.books.length;i++) {
				  if(s.books[i].equals(bookname)) {
					  continue;
				  }else {
					  removebook[count]=s.books[i];
					  count++;
				  }
			  }
				  s.books=removebook;
			  }
			  public static void main(String [] args) {
				  _11Library l1= new _11Library();
				  String [] book11= {"ranjith","kumar","vanga","bvcbhbvch"};
				  l1.toaddbooks(book11);
				  for(int i=0;i<l1.books.length;i++) {
					  System.out.println("books in library  :  "+l1.books[i]);
				  }
				  l1.toremovebooks(l1, "ranjith");
				  for(int i=0;i<l1.books.length;i++) {
					 System.out.println("books after removing:   "+ l1.books[i]); 
				  }
			  }
		}
