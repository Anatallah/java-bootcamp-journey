package Day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        // try-with-resources is better and cleaner
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt", true));

            /* writer.write("Hello, this is my first file!");
            writer.newLine();
            writer.write("This is line 2."); */

            writer.write("Test1,2026-04-20,45.2");
            writer.newLine();

            writer.write("Test2,2026-04-20,00.0");
            writer.newLine();

            writer.write("Test3,2026-04-20,89.2");
            writer.newLine();

            writer.write("Test4,2026-04-20,05.5");
            writer.newLine();

            writer.write("Test5,2026-04-20,-10.2");
            writer.newLine();

            writer.newLine();

            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}