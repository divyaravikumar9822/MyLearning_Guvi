import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int large = 0;
      if((a>b) && (a>c))
        large = a;
       if((b>a) && (b>c))
        large = b;
      if((c>a) && (c>b))
      large = c;
       System.out.println(large); 
    }
}
