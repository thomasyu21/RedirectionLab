import java.util.*;
public class PigLatin{
  public static void main( String[]args ){

    /*
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
    System.out.println();

    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
    */
  }

  public static String pigLatinSimple(String s){
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
    return (pigLatinSimple(result));
  }
}
