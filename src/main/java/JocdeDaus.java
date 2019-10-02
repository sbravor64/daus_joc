import java.util.Random;
import java.util.Scanner;


public class JocdeDaus {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int countGanados=0, countPerdidos=0;
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

        System.out.print("Dau 1 --> ");
        dau1.imprimir();
        System.out.print(" Dau 2 --> ");
        dau2.imprimir();
        System.out.print(" Dau 3 --> ");
        dau3.imprimir();

        System.out.println();

        if(dau1.dado==dau2.dado & dau2.dado==dau3.dado){
            System.out.println("¡¡HAS GANADO!!");
            countGanados++;

        } else{ countPerdidos++; }

    }

    void gestionPartidas(){
        System.out.println("HAS PERDIDO: " + countPerdidos + " VECES");
        if(countGanados==1){
            System.out.println("HAS GANADO: " + countGanados + " VEZ");
        } else {
            System.out.println("HAS GANADO: " + countGanados + " VECES");
        }
    }

}

