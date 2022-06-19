package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Utilidades utilidades=new Utilidades();
    Scanner scanner=new Scanner(System.in);
        System.out.println("Introduza quantia");
        int quantia=scanner.nextInt();
    utilidades.selos2(quantia);
    }
}
