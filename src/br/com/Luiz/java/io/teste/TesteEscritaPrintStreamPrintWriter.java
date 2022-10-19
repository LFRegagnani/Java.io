package br.com.Luiz.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {
    
    public static void main (String []args) throws IOException {

        //Fluxo de entrada com arquivo
//     BufferedWriter bw = new BufferedWriter(new FileWriter("Teste colocar no app java3.txt"));

        PrintStream ps = new PrintStream("Teste colocar no app java2.txt");

     ps.println("eitaaaaaaaaaaaaaaaa");
     ps.println();
     ps.println();
     ps.println();
     ps.println("Essa classe é melhor ainda de usar para imprimir coisas");

     ps.close();//NUNCA ESQUECER DE FECHAR O FLUXO

    }
}

