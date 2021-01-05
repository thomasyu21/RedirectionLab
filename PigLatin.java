import java.util.*;
public class PigLatin{
  public static void main( String[]args ){
      Scanner n = new Scanner( System.in );

      while (n.hasNextLine()){
        Scanner m = new Scanner(n.nextLine());
        while (m.hasNext()){
          System.out.print(pigLatinSimple(m.next()) + " ");
        }
        System.out.println();
      }
  }

  public static String pigLatinSimple(String s){
    String[] vowels = {"a","e","i","o","u"};
    int indexVowel = 0;
    for (int i = 0; i < s.length(); i++){
      for (int j = 0; j < 5; j++){
        if (s.substring(i, i+1).equals(vowels[j])){
          indexVowel = i;
          i = s.length();
          j = 5;
        }
      }
    }
    String result = s.substring(indexVowel, s.length());
    if (indexVowel == 0){
      result+="hay";
    }else{
      result+=(s.substring(0, indexVowel) + "ay");
    }
    return result;
  }
}
