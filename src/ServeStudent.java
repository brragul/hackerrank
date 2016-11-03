import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class ServeStudent {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      Student[] st = new Student[totalEvents];
      int i=0;
      while(totalEvents>0){
         String event = in.next();
            
         String[] split = event.split(" ");
         if(split.length>1)
         {
         st[i] = new Student(Integer.parseInt(split[0]),split[1],Double.parseDouble(split[2]));
         i++;
         }
         totalEvents--;
      }
    }
}
