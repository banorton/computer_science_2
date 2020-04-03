package lab2random;
import java.util.Random;
        
public class Lab2random {

    public static void main(String[] args) {
        Random rand = new Random(100);
        for (int i = 0; i < 10; i++){
            System.out.print(rand.nextInt(101) + ", ");
        }
        System.out.println();
        System.out.println(rand.nextInt(101)-50);
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextDouble()*100.0);
    }
    
}
