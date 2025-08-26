/*
Nombre: Bruno Antonio Galvan Morales
Matricula: 2913513
Actividad: 2
Modulo: 1
*/

import java.util.Scanner;

public class act_2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /*

        int horasTrabajdas = 200 ;
        double precioHora = 250.00;

        double salario_mensual = horasTrabajdas * precioHora;

        System.out.println("El salario es igual a: " + salario_mensual);


        //2

        System.out.println("Ingresa tu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Ingresa tu altura: ");
        double altura = scanner.nextDouble();

        double imc = peso /  Math.pow(altura, 2);

        if (imc < 18){
            System.out.println("Peso bajo. Necesario valorar signos de desnutricion");
        }
        else if (imc >= 18 && imc <=24.9  ){
            System.out.println("Normal");
        }
        else if (imc >= 25 && imc <= 26.9 ) {
            System.out.println("Sobrepeso ");

        } else if (imc > 27) {
            System.out.println("Obesidad");


        //3
        System.out.println("Ingresa un numero: ");
        int num = scanner.nextInt();

        var num_2 = Math.pow(num, 2);
        var num_3 = Math.pow(num,3);

        System.out.println("El cuadrado es: " + num_2);
        System.out.println("El cubo es: " + num_3);
        */

        // 4
        System.out.println("Ingresa un numero del 0 al 10: ");
        int num = scanner.nextInt();

        if (num == 0 ){
            System.out.println("Tu numero es el cero");

        } else if (num == 1) {
            System.out.println("Tu numero es uno");

        } else if (num == 2) {
            System.out.println("Tu numero es dos");

        } else if (num == 3) {
            System.out.println("Tu numero es tres");

        } else if (num == 4) {
            System.out.println("Tu numero es cuatro");

        } else if (num == 5) {
            System.out.println("Tu numero es cinco");

        } else if (num == 6) {
            System.out.println("Tu numero es seis");

        } else if (num == 7) {
            System.out.println("Tu numero es siete");

        } else if (num == 8) {
            System.out.println("Tu numero es ocho");

        } else if (num == 9) {
            System.out.println("Tu numero es nueve");

        } else if (num == 10) {
            System.out.println("Tu numero es diez");

        }

    }
    }



