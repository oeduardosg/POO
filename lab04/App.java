
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        
        InputStream is = new FileInputStream("alunos.csv");
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        LinkedList<Estudante> alunos = new LinkedList<Estudante>();
        String linha = br.readLine();

        while(linha != null) {

            Scanner s = new Scanner(linha);
            s.useLocale(Locale.ENGLISH);
            s.useDelimiter(";");

            Estudante e = new Estudante(s.next(), s.next(), s.nextDouble());
            linha = br.readLine();

            s.close();

            alunos.add(e);
            
        }

        Comparador comp = new Comparador();
        Collections.sort(alunos, comp);

        for(Estudante i: alunos) {
            System.out.println(i);
        }

        br.close();

    }

}