package br.com.dio.tratamentoexcecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionCustomizada1 {

    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog(null, "Nome do arquivo");

        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception o programa continua");

    }

    public static void imprimirArquivoNoConsole(String nomeArquivo) {

        try {

            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado entre em contato com o suporte" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));

        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo " + nomeArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeArquivo= '" + nomeArquivo + '\'' +
                ", diretorio= '" + diretorio + '\'' + "}";
    }
}
