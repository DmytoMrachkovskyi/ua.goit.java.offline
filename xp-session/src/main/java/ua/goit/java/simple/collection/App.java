package ua.goit.java.simple.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by studentgoit on 04.06.16.
 */
public class App {

    public static void main(String[] args){
        List list = new ArrayList();
        list.add(1);
        boolean res=list.remove("Test");
        System.out.println(res);

        SimpleList simplelist = null;
        for(Object obj:simplelist){

        }


    }


    public void caller(){
        List<String> list = null;
        m(list);
        List<Integer> list1 = null;
        m(list1);
    }

    public void m(List list){

    }

}
