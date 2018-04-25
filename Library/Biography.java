package Library;

/*
 * @Robson
 */
public final class Biography extends Book {

    private Name subject;

    /**
     * Constructor for Biography
     * @param authorFirstName
     * @param authorLastName
     * @param bookTitle
     * @param publishedYear
     * @param subject
     */
    public Biography(Name authorFirstName, Name authorLastName, String bookTitle, int publishedYear, Name subject) throws InvalidArgumentException, InvalidBookDateException {
        super(authorFirstName, authorLastName, bookTitle, publishedYear);
        this.setSubject(subject);
    }

    /**
     * Set the subject of this biography
     * @param subject
     */
    public void setSubject(Name subject) {
        this.subject = subject;
    }

    /**
     * Get the subject of this biography
     * @return subject
     */
    public Name getSubject() {
        return subject;
    }

    /**
     * Biographies are equals if they have the same subject
     * @param o
     * @return true if equals, false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof Biography){
            Biography biography = (Biography) o;
            if(o == this || this.subject.equals(biography.getSubject())){
                return true;
            }
        }
        return false;
    }

    /**
     * All the information about this biography
     * @return string
     */
    @Override
    public String toString() {
        return "Biography [Author's First Name: "+this.getAuthorFirstName()+", Author's Last Name: "+this.getAuthorLastName()+", " +
                "Book Title: "+this.getBookTitle()+", Published Year: "+this.getPublishedYear()+", Subject: "+this.getSubject()+"]";
    }
}
