package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book  extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book() {

    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        if (!authors.contains(author)) {
            authors.add(author);
            System.out.println("Added " + author);
        } else {
            System.out.println("Author " + author + " already exists.");
        }
    }

    public void removeAuthor(String author) {
        if (authors.contains(author)) {
            authors.remove(author);
            System.out.println("Removed " + author);
        } else {
            System.out.println("Author " + author + " does not exist.");
        }
    }
}
