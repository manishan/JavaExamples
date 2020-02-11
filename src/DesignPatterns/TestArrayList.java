package DesignPatterns;

import java.util.ArrayList;

public class TestArrayList {

    public void Test(ArrayList<String> list){
        System.out.println(list.size());
    }

    public static void main(String args[]){
        TestArrayList ta= new TestArrayList();
        ta.Test(new ArrayList());
    }
}
