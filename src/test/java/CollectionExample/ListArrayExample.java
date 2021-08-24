package CollectionExample;
import java.util.*;
public class ListArrayExample {
    public static void main(String[] args){
        listArrayMethod();
    }
    public static void listArrayMethod(){
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Java");
        arrayList.add("Oracle");
        arrayList.add("DBMS");
        for(String s: arrayList){
            System.out.println(s);
        }
    }
}
