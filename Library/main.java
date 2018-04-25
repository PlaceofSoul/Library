package Library;

public class main {

	/**
	 * @author Robson
	 */
	public class Main {

	    public static void main(String[] args) {
	        /*
	         * addbook
	         */
	        Bookstore bookstore = new Bookstore();

	        Name authorFirstName = new Name("John");
	        Name authorLastName = new Name("Tolkien");
	        bookstore.addBook(authorFirstName, authorLastName, "Lord Of The Rings", 1954);
	        bookstore.addBook(authorFirstName, authorLastName, "The Hobbit", 1937);

	        authorFirstName = new Name("Joanne");
	        authorLastName = new Name("Rowling");
	        bookstore.addBook(authorFirstName, authorLastName, "Harry Potter and the Prisoner of Azkaban", 1999);
	        bookstore.addBook(authorFirstName, authorLastName, "Harry Potter and the Philosopher's Stone", 1997);
	        bookstore.addBook(authorFirstName, authorLastName, "Harry Potter and the Chamber of Secrets", 1998);

	        authorFirstName = new Name("Arthur");
	        authorLastName = new Name("Doyle");
	        bookstore.addBook(authorFirstName, authorLastName, "A Study in Scarlet", 1887);
	        bookstore.addBook(authorFirstName, authorLastName, "The Sign of the Four", 1890);

	        /*
	         * Display books
	         */
	        bookstore.displayBooks();

	        /*
	         * Exceptions
	         */
	        System.out.println("\nTrying to save a book with author's last name null: ");
	        authorFirstName = new Name("Stan");
	        authorLastName = null;
	        bookstore.addBook(authorFirstName, authorLastName, "Guardians of the Galaxy", 1969);

	        System.out.println("\nTrying to save a book with published year bigger than 2017: ");
	        authorFirstName = new Name("Stan");
	        authorLastName = new Name("Lee");
	        bookstore.addBook(authorFirstName, authorLastName, "Guardians of the Galaxy", 2020);

	        /*
	         * Biography
	         */
	        System.out.println("\nBiographies: ");
	        Biography biography1 = null, biography2 = null, biography3 = null;
	        try {
	            biography1 = new Biography(new Name("John"), new Name("Tolkien"), "The Hobbit", 1937, new Name("Fantasy"));
	            biography2 = new Biography( new Name("John"), new Name("Tolkien"), "Lord Of The Rings", 1937, new Name("Fantasy"));
	            biography3 = new Biography(new Name("Stan"), new Name("Lee"), "Guardians of the Galaxy", 1969, new Name("Superhero"));
	        } catch (InvalidBookDateException ex){
	            System.out.println(ex);
	        } catch (InvalidArgumentException e){
	            System.out.println(e);
	        }
	        System.out.println("Biography 1:" + biography1);
	        System.out.println("Biography 2:" + biography2);
	        System.out.println("Biography 3:" + biography3);
	        System.out.println("The biographies 1 and 2 are equals: " + biography1.equals(biography2));
	        System.out.println("The biographies 2 and 3 are equals: " + biography2.equals(biography3));
	    }

}
