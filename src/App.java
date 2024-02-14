import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        String path = "/home/wendel/aula/file.txt";
        writeFile(path);
        System.out.println("=============================");
        readFile(path);
    }

    public static void writeFile(String path){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter(path)) {
            System.out.println("Entre com seu texto: ");
            String data;
            do {
                data = reader.readLine();
                data += "\n";
                if (data.equals("stop\n")) break;
                fw.write(data);
            }while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public  static void readFile(String path) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String data;
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
