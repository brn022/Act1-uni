/*
Nombre: Bruno Antonio Galvan Morales
Matricula: 2913513
Materia: Computación en java
* */


import java.util.Scanner;

public class act_1 {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    // Estructura secuencial

        //1.
        /*
        System.out.println("Calculo del area de un triangulo");
        System.out.println("Ingresa el tamaño de la base: ");
        var base = scanner.nextInt();
        System.out.println("Ingresa el tamaño de la altura: ");
        var altura = scanner.nextInt();

        var area = base * altura/2;
        System.out.println("El area del triangulo es:" + " " + area);
        */

        /*
        //2.
        System.out.println("Convierte una variable en kilometros y la convierta a metros y centimetros:");
        System.out.println("Ingresa los kilometros:");
        float km = scanner.nextFloat();

        float m = km * (1000/1);
        float cm = m * (100/1);

        System.out.println("La cantidad que ingresaste en metros y centimetros: ");
        System.out.println("Metros:"+ m + " " + "Metros");
        System.out.println("Centimetros" + cm + " "+ "Centimetros");


        //3
        System.out.println("Ingresa el primer valor: ");
        int a = scanner.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        int b = scanner.nextInt();

        int suma = a + b;
        int resta = a - b;
        int mult = a * b;
        float div = a/b;

        System.out.println("Resultado de la suma es: " + suma);
        System.out.println("Resultado de la resta es: " + resta);
        System.out.println("Resultado de la multiplicacion es" + mult);
        System.out.println("Resultado de la division es: " + div);
        */

        // SENTENCIAS IF

        //4
        /*
        System.out.println("Ingresa el primer valor: ");
        int a = scanner.nextInt();
        System.out.println("Ingresa el segundo valor ");
        int b = scanner.nextInt();

        if (a == b ) {
            System.out.println("Los valores si son iguales.");
        }
        else {
            System.out.println("Los valores no son iguales");
        }


        // 5
        System.out.println("Ingresa el primer valor: ");
        int a = scanner.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        int b = scanner.nextInt();
        System.out.println("Ingresa el tercer valor: ");
        int c = scanner.nextInt();

        if( a > b){
            if (a>c){
                System.out.println("El primer numero es el mas grande");
            }

        }
        else {
            if (b>a){
                if (b>c){
                    System.out.println("El segundo numero es el mas grande");
            }
        }
        else {
            if(c>a){
                if (c>b){
                    System.out.println("El tercer numero es el mas grande");
                }
                }
            }

        }



        //6

        System.out.println("Ingresa el valor: ");
        int num = scanner.nextInt();

        if (num % 2 == 0 ){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
        */

        //SENTENCIA FOR

        //7
        /*
        for(int i = 1; i <= 10; i++ ){
            System.out.println("5 X " + i + " = " + (5*i));

        }

         //8
        for(int i = 1;i <= 100; i++){
            System.out.println("Lista del uno al cien: " + i);

        }

         */
        //9
        for(int i = 210; i >= 0; i-=3){
            System.out.println(i);

        }
    }
}
