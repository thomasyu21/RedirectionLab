import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      Scanner n = new Scanner( System.in );
      while (n.hasNextLine()){
        Scanner m = new Scanner(n.nextLine());
        while (m.hasNext()){
          String temp = m.next();
          for (int i = 0; i < temp.length(); i++){
            System.out.print("*");
          }
          System.out.print(" ");
        }
        System.out.println();
      }
  }
}
