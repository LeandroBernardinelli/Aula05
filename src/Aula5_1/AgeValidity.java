package Aula5_1;

import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);        

System.out.println("informe sua idade:");
int idade = scanner.nextInt();
boolean drivingUnderAge; 
drivingUnderAge = false;
if (idade <18) {
    System.out.println("motorista menor de idade");
}
if (idade >=18) {

    System.out.println(drivingUnderAge);}
       
    }
    }
