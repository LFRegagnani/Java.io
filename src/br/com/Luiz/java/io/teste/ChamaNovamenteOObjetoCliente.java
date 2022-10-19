package br.com.Luiz.java.io.teste;

import java.io.*;

public class ChamaNovamenteOObjetoCliente {
    public static void main(String[]args) throws IOException, ClassNotFoundException {

        ObjectInputStream cliente = new ObjectInputStream(new FileInputStream("cliente.bin"));

        Cliente clienteLido = (Cliente) cliente.readObject();
        clienteLido.setCpf("123");

        System.out.println(clienteLido.getNomeECpfJuntos());

        cliente.close();

    }
}
