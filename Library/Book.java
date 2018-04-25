package Library;
/*
 * @Robson
 */
public class Book implements Comparable<Book> {

    private Name authorFirstName;
    private Name authorLastName;
    private String bookTitle;
    private int publishedYear;

    /**
     * Constructor for Book
     * @param authorFirstName
     * @param authorLastName
     * @param bookTitle
     * @param publishedYear
     */
    public Book(Name authorFirstName, Name authorLastName, String bookTitle, int publishedYear) throws InvalidArgumentException, InvalidBookDateException {
        this.setAuthorFirstName(authorFirstName);
        this.setAuthorLastName(authorLastName);
        this.setBookTitle(bookTitle);
        this.setPublishedYear(publishedYear);
    }

    /**
     * Return the first name of the author
     * @return authorFirstName
     */
    public final Name getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * First name of the author
     * @param authorFirstName
     * @throws InvalidArgumentException
     */
    public final void setAuthorFirstName(Name authorFirstName) throws InvalidArgumentException {
        if(authorFirstName == null || authorFirstName.getName().isEmpty()){
            throw new InvalidArgumentException("First Name can't be null");
        }else {
            this.authorFirstName = authorFirstName;
        }
    }

    /**
     * Last name of the author
     * @return authorLastName
     */
    public final Name getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Set the last name of the author
     * @param authorLastName
     */
    public final void setAuthorLastName(Name authorLastName) throws InvalidArgumentException {
        if(authorLastName == null || authorLastName.getName().isEmpty()){
            throw new InvalidArgumentException("First Name can't be null");
        }else {
            this.authorLastName = authorLastName;
        }
    }

    /**
     * Return the title of the book
     * @return bookTitle
     */
    public final String getBookTitle() {
        return bookTitle;
    }

    /**
     * Set the title of the book
     * @param bookTitle
     */
    public final void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Return the year that the book was published
     * @return publishedYear
     */
    public final int getPublishedYear() {
        return publishedYear;
    }

    /**
     * Set the year that the book was published
     * @param publishedYear
     */
    public final void setPublishedYear(int publishedYear) throws InvalidBookDateException {
        if(publishedYear > 2017){
            throw new InvalidBookDateException("The published year can't be greater than 2017");
        }else {
            this.publishedYear = publishedYear;
        }
    }

    /**
     * Books are equals if they have the same title and published year
     * @param o
     * @return true if equals, false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof Book){
            Book book = (Book) o;
            if(o == this || (this.getBookTitle().equals(book.getBookTitle()) &&
                    this.getPublishedYear() == book.getPublishedYear())){
                return true;
            }
        }
        return false;
    }

    /**
     * HashCode created based on the publishedYear and bookTitle
     * @return hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result + this.getPublishedYear() +
                (this.getBookTitle() == null ? 0 : this.getBookTitle().hashCode()));
        return result;
    }

    /**
     * A book is greater than other if their publishedYear is bigger
     * @param book
     */
    @Override
    public int compareTo(Book book) {
        if(this.getPublishedYear() > book.getPublishedYear()){
            return 1;
        }else if(this.getPublishedYear() == book.getPublishedYear()) {
            return 0;
        }
        return -1;
    }

    /**
     * All the information about this book
     * @return string
     */
    @Override
    public String toString() {
        return "Book [Author's First Name: "+this.getAuthorFirstName()+", Author's Last Name: "+this.getAuthorLastName()+", " +
                "Book Title: "+this.getBookTitle()+", Published Year: "+this.getPublishedYear()+" ]";
    }
}