package collection.beginnersbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingPgm {
    public static void main(String args[]){
        ArrayList<Author> al = new ArrayList<Author>();

        al.add(new Author("Manisha","book1",32));
        al.add(new Author("Manya","book2",34));
        al.add(new Author("Mani","book3",29));
        System.out.println("Sorting by author firstName");
        /*Collections.sort(al);
        for(Author a:al){

        }*/
        System.out.println("Sorting by author age");
        Collections.sort(al,new AuthorAgeComparator());
        for(Author a:al){
            System.out.println(a.firstName+" "+a.auAge+" "+a.bookName);
        }

        System.out.println("Sorting by author bookname");
        Collections.sort(al,new BookNameComparator());
        Iterator<Author> itr= al.iterator();
        while(itr.hasNext()){
            Author a= (Author)itr.next();
            System.out.println(a.firstName+" "+a.auAge+" "+a.bookName);
        }

    }
}
