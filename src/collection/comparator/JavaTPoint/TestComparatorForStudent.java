package collection.comparator.JavaTPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparatorForStudent {
    public static void main(String args[]){
        ArrayList<Student>  list = new ArrayList<Student>();
        list.add(new Student(101,"abc",32));
        list.add(new Student(102,"Manasvi",3));
        list.add(new Student(103,"Swapnil",34));

        //sort using comparator
        Collections.sort(list,new AgeComparator());
        System.out.println("Sort list by age****");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Student s1 =(Student)itr.next();
            System.out.println(s1.rollno+s1.name+s1.age);
        }

        System.out.println("Sort list using name*****");
        Collections.sort(list, new NameComparator());
        Iterator itr1 = list.iterator();
        while(itr1.hasNext()){
            Student s1 =(Student)itr1.next();
            System.out.println(s1.rollno+s1.name+s1.age);
        }
    }
}
