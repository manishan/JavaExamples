package collection;

import java.util.Comparator;

public class Student {
    int rollno;
    String name;
    int age;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }


    /*@Override
    public int compareTo(Student stuObj) {
        int compareAge = stuObj.getAge();
        //for ascending order
        return this.age - compareAge;
        *//* For Descending order do like this *//*
        //return compareage-this.studentage;
    }*/

    public String toString(){
        return "[ rollno=" + rollno + ", name=" + name + ", age=" + age + "]";

    }

    public static Comparator<Student> studentComparator =  new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String studentName1 = o1.name;
            String studentName2 = o2.name;
            //ascending order
            return studentName1.compareTo(studentName2);
            //Descending order
            //return studentName2.compareTo(studentName1);
        }
    };

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Student> StuRollno = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {

            int rollno1 = s1.getRollno();
            int rollno2 = s2.getRollno();

            /*For ascending order*/
            return rollno1-rollno2;

            /*For descending order*/
            //rollno2-rollno1;
        }};


}