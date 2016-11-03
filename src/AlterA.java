import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlterA {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^A{0,3}(a{1,3}A{1,3})*a{0,3}$"); // Use \\ instead of using \ 
    
    }
}
class Regex_Test {

    public void checker(String Regex_Pattern){
    
        //Scanner Input = new Scanner(System.in);
        String Test_String = "aaaaAA";//Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}