
/**
 * Bavya Chowdavarapu
 * 8/23/22
 * Chapter 1 Notes
 * Notes from class
 * Who helped me: 
 */
import java.util.Scanner; // class is last arg
import java.util.Random;





public class ch1Notes
{
    /**
     * This is code notes for ch1
     * 
     * 
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        // basic data types 
        int x = 9, y, z; //4 bytes
        boolean choice = false;
        char letter = 'b';
        float number2 = 9; //double but 4 bytes
        double number = 8.9, number3; //float but 8 bytes
        short num = 6; // int but takes up less memory 
        long numbbbbbbbbbbbber = 9999; //int but gives you more memory
        
        
        
        //These are objects    ------ constructor might need to be called
        //Class id            memory     constructor
        String  word =        new        String("Bavya Chowdavarapu");
        Integer othernumber = new        Integer(47); //Integer is a class
        Double  anumber =     new        Double(45.8); // Double is a class
        
        
        
        System.out.print(word);
    }
}
