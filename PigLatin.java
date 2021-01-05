import java.util.*;
public class PigLatin{
  public static void main( String[]args ){
      Scanner n = new Scanner( System.in );

      while (n.hasNextLine()){
        Scanner m = new Scanner(n.nextLine());
        while (m.hasNext()){
          System.out.print(pigLatinBest(m.next()));
          if (m.hasNext()){
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    /*
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("David"));
    System.out.println(pigLatinSimple("Aaron"));
    System.out.println();

    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("Skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("Grade"));
    System.out.println();

    System.out.println(pigLatinBest("*emu"));
    System.out.println(pigLatinBest("4chan"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("fish"));
    System.out.println(pigLatinBest("the."));
    System.out.println(pigLatinBest("Cat!"));
    System.out.println(pigLatinBest("Amazing?"));
    System.out.println(pigLatinBest("Apple%"));
    */
  }

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    String[] vowels = {"a","e","i","o","u"};
    String result = "";
    boolean vowelStart = false;
    for (int i = 0; i < vowels.length; i++){
      if (s.substring(0, 1).equals(vowels[i])){
          vowelStart = true;
        }
      }
    if (vowelStart){
      result = s + "hay";
    }else{
      result = s.substring(1, s.length()) + s.substring(0, 1) + "ay";
    }
    return result;
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    boolean digraphStart = false;
    if (s.length() > 2){
      for (int i = 0; i < digraphs.length; i++){
        if (s.substring(0, 2).equals(digraphs[i])){
          digraphStart = true;
        }
      }
    }
    String result = "";
    if (digraphStart){
      result = s.substring(1, s.length()) + s.substring(0, 1);
    }else{
      result = s;
    }
    return pigLatinSimple(result);
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    String[] notPunctuation = {"a", "b", "c", "d", "e", "f", "g","h", "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
    boolean startLetter = false;
    boolean endPunctuation = true;
    for (int i = 0; i < 26; i++){
      if (s.substring(0, 1).equals(notPunctuation[i])){
        startLetter = true;
      }
    }
    for (int i = 0; i < notPunctuation.length; i++){
      if (s.substring(s.length()-1, s.length()).equals(notPunctuation[i])){
        endPunctuation = false;
      }
    }
    if (startLetter){
      if (endPunctuation){
        return pigLatin(s.substring(0, s.length()-1)) + s.substring(s.length()-1, s.length());
      }else{
        return pigLatin(s);
      }
    }else{
      return s;
    }
  }
}
