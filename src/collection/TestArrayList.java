package collection;

import java.util.ArrayList;

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
        Student s4=new Student(104,"Hanum",25);
        Student s5=new Student(201,"manisha",32);
        Student s6=new Student(202,"swapnil",34);
        ArrayList<Student> stdList =  new ArrayList<Student>();
        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);


        stdList.set(2,s4);
        System.out.println(stdList.get(2).name);
        System.out.println(stdList.remove(s1));
        for(int i=0;i<stdList.size();i++){

            System.out.println(stdList.get(i).name);
        }
        /*Iterator<Student> itr =  stdList.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }*/
        /*HashMap<Student,String> hm= new HashMap<Student,String>();
        hm.put(s1,"std1");
        hm.put(s2,"std2");
        hm.put(s3,"std3");
        Iterator<Student> ithm = hm.keySet().iterator();
        while(ithm.hasNext()){
            Student st = (Student)ithm.next();
            System.out.println(st.name+" "+hm.get(st));
        }*/

    }
}
