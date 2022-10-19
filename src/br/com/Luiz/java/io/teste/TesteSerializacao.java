package br.com.Luiz.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String nome = "Luiz Fernando Regagnani";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));

        oos.writeObject(nome);
        oos.close();


        ////////////////////////

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome2 = (String) ois.readObject();
        ois.close();

        System.out.println(nome2);


    }
}
