package com.ashleece;
import javax.print.attribute.standard.RequestingUserName;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
System.out.println("Ievadiet lietotájvárdu");
String userName = scanner.nextLine();

System.out.println("Ievadiet paroli");
String password = scanner.nextLine();

if("Asnate".equals(userName) && ("Muca".equals(password))){
    System.out.println("Esat sveicináts/a!");
        }else {
    System.out.println("Nepareizs lietotájvárds vai parole");
        }
    }
    }
}