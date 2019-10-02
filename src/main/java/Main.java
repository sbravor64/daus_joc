import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        JocdeDaus jocdeDaus = new JocdeDaus();

        while (true){
            System.out.println("JOC DE DAUS");
            System.out.println("1. Tirar Dados");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            if(opcion==1){
                jocdeDaus.jugar();
                System.out.println();
            } else if(opcion==2){
                break;
            }
        }

        jocdeDaus.gestionPartidas();

    }

}
