package Program;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class CountCharacterFromTheString {
    public static void main(String[] args){
        String givenString="This is an example of count character";
        Map<Character,Integer> charCount=new HashMap<>();
        for(int i=0;i<givenString.length();i++){
            int count=0;
            for(int j=0;j<givenString.length();j++){
                if(givenString.charAt(i)==givenString.charAt(j)){
                    count++;
                }
                charCount.put(givenString.charAt(i),count);
            }
        }
        System.out.println(charCount);
        for(Map.Entry<Character,Integer> cc:charCount.entrySet()){
            System.out.println("Character is ->" + cc.getKey());
            System.out.println("Count is ->"+cc.getValue());
        }
        countMethod("AA BBBBBB CCCCC");
    }
    public static void countMethod(String sentence){
        HashMap<Character,Long> countChar=new HashMap<>();
        for(int i=0; i<sentence.length();i++) {
            char c = sentence.charAt(i);
            long count = sentence.chars().filter(ch -> ch == c).count();
            countChar.put(c,count);
        }
        System.out.println("-----------------  Displayed  ---------------");
        for(Map.Entry<Character,Long> data : countChar.entrySet()){
            System.out.println("Character is ---> " + data.getKey() + "  Count is -->"+data.getValue());
        }
    }
}
