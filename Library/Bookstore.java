package Library;
/*
 * @author Robson
 */
public class Bookstore {

	    private ArrayList<Book> books = new ArrayList<>();

	    /**
	     * Method to add a new book into the books arrayList
	     * @param authorFirstName
	     * @param authorLastName
	     * @param bookTitle
	     * @param publishedYear
	     */
	    
	    public void addBook(Name authorFirstName, Name authorLastName, String bookTitle, int publishedYear){
	        try{
	            Book book = new Book(authorFirstName, authorLastName, bookTitle, publishedYear);
	            books.add(book);
	        } catch (InvalidBookDateException ex){
	            System.out.println(ex);
	        } catch (InvalidArgumentException e){
	            System.out.println(e);
	        }
	    }

	    /**
	     * Print all the books in the arrayList before and after sorting
	     */
	    
	    public void displayBooks(){
	        System.out.println("Printing books before sorting: ");
	        for(Book book : books){
	            System.out.println(book);
	        }

	        Collections.sort(books);

	        System.out.println("\nPrinting books after sorting: ");
	        for(Book book : books){
	            System.out.println(book);
	        }
	    }
	}
