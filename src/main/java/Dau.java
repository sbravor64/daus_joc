import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dau {
    Random random = new Random();
    int dado;

    public void tirardados(){
        dado = (int) (Math.random() * 6) + 1;
    }

    void imprimir(){
        System.out.print(dado + " ");
    }
}

