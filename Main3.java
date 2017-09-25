import java.util.Scanner;

public class Main3  {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char chOld = scn.next().charAt(0);
        char chNew = scn.next().charAt(0);
        System.out.println(str.replace(chOld , chNew));
    }
}