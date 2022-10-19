package br.com.Luiz.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestaScanner {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");


        String linha = scanner.nextLine();
        System.out.println(linha);


        Scanner scanSeparado = new Scanner(linha);

        scanSeparado.useDelimiter(",");


        System.out.println(scanSeparado.next());
        System.out.println(scanSeparado.next());
        System.out.println(scanSeparado.next());
        System.out.println(scanSeparado.next());
        System.out.println(scanSeparado.next());


        scanner.close();


    }
}
