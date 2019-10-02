import java.util.Random;
import java.util.Scanner;


public class JocdeDaus {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Dau dau1;
    Dau dau2;
    Dau dau3;

    public JocdeDaus(){
        dau1=new Dau();
        dau2=new Dau();
        dau3=new Dau();
    }

    void jugar(){
        dau1.tirardados();
        dau2.tirardados();
        dau3.tirardados();

        dau1.imprimir();
        dau2.imprimir();
        dau3.imprimir();

        System.out.println();

        if(dau1.dado==dau2.dado & dau2.dado==dau3.dado){
            System.out.println("GANADO");
            return;
        }

    }

}

