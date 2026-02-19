
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class append {

    public static void main(String[] args) {

        try {

            
            FileReader fr = new FileReader("sample.txt");
            int i;
            String oldContent = "";

            System.out.println("Reading File Content:");

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
                oldContent += (char) i;
            }

            fr.close();

            System.out.println("\nFile read successfully.");

            System.out.println("\nContent BEFORE Append:");
            System.out.println(oldContent);


            
            FileWriter fw = new FileWriter("charfile.txt", true);

            fw.write("\nheloo dc , appended line");
            fw.close();

            System.out.println("\nFile appended successfully.");


          
            FileReader fr2 = new FileReader("sample.txt");

            System.out.println("\nContent after Append:");

            while ((i = fr2.read()) != -1) {
                System.out.print((char) i);
            }

            fr2.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}