package br.com.dio.tratamentoexcecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CheckedException {

    public static void main(String[] args) {

        String nomeDoArquivo = "teste.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro inesperado entre em contato com o suporte." + e.getCause());
        } finally {
            System.out.println("Chegou no Finally");
        }

        System.out.println("Apesar da exception o programa continua");

    }

    public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {

        File file = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);

        bw.flush();
        br.close();
    }
}
