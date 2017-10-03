import java.util.Scanner;

public class HW1 {
    public static void main(String[] chr) {
        Scanner scn = new Scanner(System.in);
      char a = scn.next().charAt(0);
      if (a>=65 && a<=90 )
        {
            System.out.println("uppercase");
        }
        else if(a>=97 && a<=122) {

            System.out.println("lowercase");
        }
        else {
            System.out.println("special character");
        }

    }
}