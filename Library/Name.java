package Library;
/*
 * @Robson
 */
public class Name {

    private String name;

    /**
     * Constructor for Name
     * @param name
     */
    
    public Name(String name){
        this.setName(name);
    }

    /**
     * Return name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Names are equals if they have the same name
     * @param o
     * @return true if equals, false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof Name){
            Name name = (Name) o;
            if(o == this || this.getName().equals(name.getName())){
                return true;
            }
        }
        return false;
    }

    /**
     * HashCode using name
     * @return hashCode
     */
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result + this.getName() == null ? 0 : this.getName().hashCode());
        return result;
    }

    /**
     * Return a string with the name information
     * @return string
     */
    
    @Override
    public String toString() {
        return this.getName();
    }
}