import java.text.NumberFormat;
import java.util.Locale;

public class First{//CLASS DECLARATION
    public static void main(String [] args){ 
    //MAIN METHOD)
        System.out.println("Sarah"); //print syntax

        NumberFormat nmf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT); 

        System.out.println(nmf.format(23000)); //23k
        System.out.println(nmf.format(45000000)); //45M


        // NumberFormat nmf1 = NumberFormat.getCompactNumberInstance(Locale.US),NumberFormat.Style.SHORT); 

        System.out.println(nmf.format(560000000)); //560M
        System.out.println(nmf.format(45000)); //45k
    }
}

