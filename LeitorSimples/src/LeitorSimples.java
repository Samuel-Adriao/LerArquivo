import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;

public class LeitorSimples {
    public static void main(String[] args) throws Exception {

    try{
        FileReader leitor = new FileReader("arquivo.txt");
        BufferedReader buffer = new BufferedReader(leitor);

        String arquivoLinha;
        while((arquivoLinha = buffer.readLine()) != null){
            System.out.println("A frade é: " + arquivoLinha);
        }

        buffer.close();
        leitor.close();
    } catch(IOException e){
        System.out.println("ERRO!");
        e.printStackTrace();
    }











    }
}
