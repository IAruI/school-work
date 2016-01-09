public class PI {
   public static void main(String[] args) {
      double pi = 0;
      double y = 1;
      int lps = 900000;
      int cnt = 0;
      for(int x=1; x < lps; x+=2) {
//         System.out.println("x=" + x + ", y=" + y + "  y/x=" + (y/x) + ", pi=" + pi);
         pi = pi + (y/x);
         y = -y;    // alternate the sign each time
         cnt++;
      }
      System.out.println("PI=" + 4*pi + " after " + cnt); //PI=3.141592642478473 after 90000000
   }
}