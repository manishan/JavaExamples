package collection.beginnersbook;

public class Author {
    String firstName;
    String bookName;
    int auAge;
    Author(String firstName,String bookName,int auAge){
        this.firstName =firstName;
        this.bookName = bookName;
        this.auAge =  auAge;
    }

    public String getLastName() {
        return bookName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.bookName = lastName;
    }

    public int getAuAge() {
        return auAge;
    }

    public void setAuAge(int auAge) {
        this.auAge = auAge;
    }

    public int compareTo(Author au){
        return this.firstName.compareTo(au.firstName);
    }
}
