package Program;
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
    }
}
