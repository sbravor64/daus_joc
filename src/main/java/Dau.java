import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dau {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int numVeces;

    void introducirVeces(){
        System.out.print("Quantes vegades vols llançar els daus? ");
        numVeces = scanner.nextInt();
    }

    void tirardados(){
        int veces;
        veces = numVeces;
        ArrayList dado = new ArrayList();

        for (int i = 0; i < numVeces ; i++) {
            int num = random.nextInt();
            System.out.println(num);
        }
    }




}
