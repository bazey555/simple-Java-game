package com.bazey2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int adiitiv = 0;
        int solution = 0;
        int cont = 1;






        while (true) {

            randomNumber1 = (int) (Math.random() * 50);


            if (randomNumber1 == 0);

            else
                break;




        }


        adiitiv = randomNumber1 * 2;
        solution = adiitiv / 2;








        System.out.println("Imagine a number from 1 to 100 and remember it");

        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.println("enter 0 to continue: ");
            cont = scanner1.nextInt();
            if (cont == 0)

                break;


            else

                System.out.println("enter 0 to continue");



        }




        System.out.println("now multiply the number by 2");


        while (true) {
            System.out.println("enter 0 to continue: ");
            cont = scanner1.nextInt();
            if (cont == 0)

                break;


            else

                System.out.println("enter 0 to continue");



        }

        System.out.println("now add: " + adiitiv + " to the result");



        while (true) {
            System.out.println("enter 0 to continue: ");
            cont = scanner1.nextInt();
            if (cont == 0)

                break;


            else

                System.out.println("enter 0 to continue");



        }



        System.out.println("now divide the number by 2");



        while (true) {
            System.out.println("enter 0 to continue: ");
            cont = scanner1.nextInt();
            if (cont == 0)

                break;


            else

                System.out.println("enter 0 to continue");



        }

        System.out.println("last step subtract the number you had at the very beginning");

        while (true) {
            System.out.println("enter 0 to continue: ");
            cont = scanner1.nextInt();
            if (cont == 0)

                break;


            else

                System.out.println("enter 0 to continue");



        }





        while (true) {

            randomNumber2 = (int) (Math.random() * 1000);

            System.out.println("processing please whait...........");





            if (randomNumber2 < 998);




            else
                break;





        }

        System.out.println("YOUR NUMBER IS : " + solution + " !!!");


    }
}
