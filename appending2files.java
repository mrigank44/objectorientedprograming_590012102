import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class appending2files {
    public static void main(String[] args) {

        try {
            FileInputStream fis2 = new FileInputStream("file2.txt");
            FileOutputStream fos1 = new FileOutputStream("file1.txt", true);

            int i;

            fos1.write("\n".getBytes());

            while ((i = fis2.read()) != -1) {
                fos1.write(i);
            }

            fis2.close();
            fos1.close();

            System.out.println("file2 merged into file1 successfully.\n");

            FileInputStream fis1 = new FileInputStream("file1.txt");

            System.out.println("Content of file1 after merging:\n");

            while ((i = fis1.read()) != -1) {
                System.out.print((char) i);
            }

            fis1.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
