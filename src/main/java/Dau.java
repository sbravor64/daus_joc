import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dau {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int numVeces;
    int dados[] = new int[numVeces];
    int dado;

    public void tirardados(){
        dado = (int) (Math.random() * 6) + 1;
    }

    void imprimir(){
        System.out.print(dado + " ");
    }
}

