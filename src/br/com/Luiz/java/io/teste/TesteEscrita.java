package br.com.Luiz.java.io.teste;

import java.io.*;

public class TesteEscrita {


    public static void main (String []args) throws IOException {

        //Fluxo de entrada com arquivo

        OutputStream arquivoTexto = new FileOutputStream("Teste colocar no app java2.txt");

        Writer leitorDeArquivo = new OutputStreamWriter(arquivoTexto);

        BufferedWriter bufferDeArquivo = new BufferedWriter(leitorDeArquivo);

        bufferDeArquivo.write("Caramba velho, será que da pra escrever de dentro da aplicação JAVA?");
        bufferDeArquivo.newLine();
        bufferDeArquivo.newLine();
        bufferDeArquivo.write("testezinho testezão duas linhas puladas a cima");

        bufferDeArquivo.close();

    }
}
