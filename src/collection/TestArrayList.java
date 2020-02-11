package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestArrayList {
    TestArrayList(){
        int age=30;
        String city = "Mumbai";
        int user_id=1;
    }
    public static void main(String args[]){
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);
        ArrayList<Student> stdList =  new ArrayList<Student>();
        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);
        Iterator<Student> itr =  stdList.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        HashMap<Student,String> hm= new HashMap<Student,String>();
        hm.put(s1,"std1");
        hm.put(s2,"std2");
        hm.put(s3,"std3");
        Iterator<Student> ithm = hm.keySet().iterator();
        while(ithm.hasNext()){
            Student st = (Student)ithm.next();
            System.out.println(st.name+" "+hm.get(st));
        }

    }
}
