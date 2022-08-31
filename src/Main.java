import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pesoIdeal;

        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenido/a, Ingrese su altura en centimetros:");
        int Altura = s.nextInt();
        System.out.println("Ahora ingrese su genero, por favor:\n 1) Masculino\n 2) Femenino");
        int Genero = s.nextInt();


        if (Genero == 1)
        {
            System.out.println("Ud selecciono Masculino");
            pesoIdeal = Altura - 110;
            System.out.println("Su peso ideal es: " + pesoIdeal + "Kg");
        }
        else if
        (Genero == 2) {
            System.out.println("Ud selecciono Femenino");
            pesoIdeal = Altura - 120;
            System.out.println("Su peso ideal es: " + pesoIdeal + "Kg");
        }
        else {
            System.out.println("Numero invalido");
        }
    }
}

