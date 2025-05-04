package exercicios;

import java.util.Scanner;

public class volume {

    public static void main(String[] args) {

        Main vol = new Main();

        Scanner sc =  new Scanner(System.in);
        System.out.println("Escreva o raio e saiba o volume");
        double raio = sc.nextFloat();

        double volume = vol.calculoVolume(raio);
        System.out.println("o volume é " + raio);
    }
}
