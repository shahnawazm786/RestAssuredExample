package CollectionExample;

import java.util.*;
public class ListClassExample {
    public static void main(String[] args){
    listMethod();
    }
    public static void listMethod(){
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Oracle");
        list.add("Selenium");
        list.add("Manual");
        list.add("Algebra");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            Object ele=itr.next();
            System.out.println("String is -> " + ele);

        }
        list.add(1,"Guava");
        System.out.println(" Displayed after adding ");
        itr=list.iterator();
        while(itr.hasNext()){
            Object ele=itr.next();
            System.out.println("String is -> " + ele);

        }
    }
}
