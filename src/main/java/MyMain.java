import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int n =  Integer.parseInt(binary);
        int d = 0;
        int count =0;
        while (n != 0){
            d += (n % 10)*(Math.pow((double) 2, (double) count));
            n /= 10;
            count++;
        }
        return d;
        // REPLACE WITH YOUR CODE HERE
    }
    
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Type in a number in binary format: ");
       String n = scan.next();
       System.out.println("That is equal to the decimal value: "+binaryToDecimal(n));
        // YOUR CODE HERE
        scan.close();
    }
}
