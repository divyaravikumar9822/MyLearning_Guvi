import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
      //int a = 2;
      int convert_metre = 0,convert_cm = 0;
      convert_metre = a*1000;
      convert_cm = a*100000;
        System.out.println(convert_metre+"\n"+convert_cm);
    }
}
