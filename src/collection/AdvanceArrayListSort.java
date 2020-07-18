package collection;

import java.util.ArrayList;
import java.util.Collections;

public class AdvanceArrayListSort {
    public static void main(String args[]){
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(223,"Manisha",45));
        arrayList.add(new Student(224,"Ashwini",32));
        arrayList.add(new Student(221,"Manisha2",25));

        Collections.sort(arrayList,Student.studentComparator);
        for(Student str: arrayList){
            System.out.println(str);
        }


        Collections.sort(arrayList,Student.StuRollno);
        for(Student str: arrayList){
        System.out.println(str);
    }
}

}
