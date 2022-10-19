package br.com.Luiz.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String []args) throws IOException, ClassNotFoundException {

        Cliente cliente1 = new Cliente("Luiz","4064","Dev");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));

        oos.writeObject(cliente1);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente clienteLuiz = (Cliente) ois.readObject();


        ois.close();

        System.out.println(clienteLuiz.getCpf());


    }
}
