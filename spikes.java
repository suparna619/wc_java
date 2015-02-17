// import java.io.*;

// public class spikes{
//    public static void main(String args[]){
//       String Str1 = new String("Welcome to Tutorialspoint.com");
//       String Str2 = new String("Tutorials" );

//       System.out.print("String Length :" );
//       System.out.println(Str1.length());

//       System.out.print("String Length :" );
//       System.out.println(Str2.length());
//    }
// }

import java.io.*;

public class spikes{
   public static void main(String args[]){
      String Str = new String("hello, this is a good day.\r\nWhat do you think?\r\n");
      String[] arr;
      int c = 0;

      // System.out.println("Return Value :" );
      // for (String retval: Str.split("-", 2)){
      //    System.out.println(retval);
      // }
      // System.out.println("");
      // System.out.println("Return Value :" );
      // for (String retval: Str.split("-", 3)){
      //    System.out.println(retval);
      // }
      // System.out.println("");
      // System.out.println("Return Value :" );
      // for (String retval: Str.split("-", 0)){
      //    System.out.println(retval);
      // }
      // System.out.println("");
      System.out.println("Return Value :" );
      for (String retval: Str.split("\r\n")){
      	
      	for(String rv: retval.split(" ")){
      		c++;
      	}
        // System.out.println(c+" : "+retval);
      }
      System.out.println("count : "+c);
      System.out.println(Str);
   }
}