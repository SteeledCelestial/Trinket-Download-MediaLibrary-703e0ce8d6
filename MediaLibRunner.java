/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook  = new Book("The Lord of the Rings","Tolkien");
    System.out.println("Book created " + myBook);
    myLib.addBook(myBook);
    int myRating = 5;
    myBook.adjustRating(myRating);
    myBook.setTitle("Joeman");
    
    //System.out.println(myBook);
    //System.out.println("Book:" + myBook);
System.out.println("Library: " + myLib);


System.out.println("You have a NEW Library");
MediaLib myLib2 = new MediaLib();

Book newBook = new Book("To Kill a Mockingbird", "Lee");
myLib2.addBook(newBook);
System.out.println(myLib2);
newBook = new Book("1984", "Orwell");
System.out.println(myLib2);

System.out.println("before test:" + newBook);
myLib.testBook(newBook);
System.out.println("after test:" + newBook);

Book myBook3 = new Book("Lord of the Rings","Tolkien");
System.out.println(myBook.equals(myBook3));

Movie myMovie= new Movie("The Matrix",2.4);
myLib.addMovie(myMovie);
System.out.println(myLib);
Movie myMovie2 = new Movie("The Matrix", 2.4);
System.out.println(myMovie.equals(myMovie2));
  } 
}