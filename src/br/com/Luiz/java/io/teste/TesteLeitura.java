package br.com.Luiz.java.io.teste;

import java.io.*;

public class TesteLeitura {


    public static void main (String []args) throws IOException {

        //Fluxo de entrada com arquivo

        InputStream arquivoTexto = new FileInputStream("Teste colocar no app java.txt");

        InputStreamReader leitorDeArquivo = new InputStreamReader(arquivoTexto);

        BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);

        String linha = bufferDeArquivo.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = bufferDeArquivo.readLine();
        }


        bufferDeArquivo.close();

    }
}
