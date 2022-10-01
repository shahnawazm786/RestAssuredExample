import java.utils;
public class List1{
  public static void main(String[] args){
    List<String> name=new ArrayList<>();
    name.add("Mohammad");
    name.add("Sariq");
    name.add("Kalam");
    name.add("Rahim");
    name.add("Zakir");
    name.add("Mod");
    name.add("Yog");
    System.out.println(name);
    name.remove("Mod");
    System.out.println(name);
  }
}
