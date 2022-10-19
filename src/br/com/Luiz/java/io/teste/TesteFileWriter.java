package br.com.Luiz.java.io.teste;

import java.io.*;

public class TesteFileWriter {

    public static void main (String []args) throws IOException {

        //Fluxo de entrada com arquivo


     BufferedWriter bw = new BufferedWriter(new FileWriter("Teste colocar no app java3.txt"));

     bw.write("eita funciona");

     bw.write(System.lineSeparator());
     bw.newLine();
     bw.write("\n");

     bw.write("pulamos uma linha tbm de tres formas diferentes");

     bw.close();

    }
}

