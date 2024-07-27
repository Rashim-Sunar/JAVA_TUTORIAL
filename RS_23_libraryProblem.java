/*
  Problem-1
  You have to implement a library using java class "Library"
  Methods: addBook, issueBook, returnBook, showAvailableBooks
  Properties: Array to store the available books, Array to store the issued books.
 */

 class library{
    private String[] books;
    private String[] issuedBooks;
    private int no_of_books, no_of_issued_books;

    library(){
        this.books = new String[100]; //Size if array is 100. 
        this.issuedBooks = new String[100];
        this.no_of_books = 0;
        this.no_of_issued_books = 0;
    }

    public void addBooks(String book){
        this.books[this.no_of_books] = book;
        this.no_of_books++;
        System.out.println(book+ " added to the collection");
    }

    public void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                this.books[i] = null; //delete book from the books collection
                this.no_of_books--;
                this.issuedBooks[no_of_issued_books] = book; //Add the book to the issuedBooks collection...
                this.no_of_issued_books++;
                System.out.println(book + " book is issued.");
                return;
            }
        }
    }

    public void returnBook(String book){
        //Deleting the returned book from the issued book array...
        for(int i = 0; i<this.issuedBooks.length; i++){
            if(this.issuedBooks[i].equals(book)){
                this.issuedBooks[i] = null;
                this.no_of_issued_books--;
                break;
            }
        }

        //Adding the returned book in the books collections... 
        this.addBooks(book);
        this.no_of_books++;

        System.out.println(book+" book is returned");
    }

    public void showAvailableBooks(){
        if(this.no_of_books == 0){
            System.out.println("No book available in bookshelves");
        }else{
            System.out.println("Available books are:");
        for(String book : this.books){
            if(book == null) continue;
            System.out.println("--> " +book);
        }
        }
    }

    public void showIssuedBooks(){
        if(this.no_of_issued_books == 0){
            System.out.println("None of the books is issued!");
        }else{
            System.out.println("Issued Books are:");
            for(String book : this.issuedBooks){
                if(book == null) continue;
                System.out.println("--> " +book);
            }
        }
    }
 }

public class RS_23_libraryProblem {
    public static void main(String[] args) {
        library centeralLibrary = new library();
        centeralLibrary.addBooks("C programming");
        centeralLibrary.addBooks("Python");
        centeralLibrary.addBooks("Java");
        centeralLibrary.addBooks("DBMS"); 
        centeralLibrary.issueBook("DBMS");
        centeralLibrary.returnBook("DBMS");
        centeralLibrary.showAvailableBooks();
        centeralLibrary.showIssuedBooks();
    }
}
