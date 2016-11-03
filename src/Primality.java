import java.util.*;
import java.math.*;

public class Primality {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      double lg = Math.sqrt(n.intValue());
      Integer zero =0;
      for(Integer i=1;i<lg;i++){
    	  BigInteger rem = n.divide(BigInteger.valueOf(i.intValue()));
    	 // if(rem.compareTo(zero.intValue()){
    		  
    	  //};
      }
      // Write your code here.
   }
}