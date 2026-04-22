package Day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadTest {

    public static void main(String[] args) {

        ArrayList<Experiment> experiments = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {

            String line;

            String best = "";
            double highest = 0.0;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                try {
                    String[] parts = line.split(",");

                    if (parts.length < 3) {
                        System.out.println("Skipping malformed line: " + line);
                        continue;
                    }

                    String name = parts[0];
                    String date = parts[1];
                    double result = Double.parseDouble(parts[2]);

                    Experiment exp = new Experiment(name, date, result);
                    if(exp.getResult() != -1) {
                            experiments.add(exp);
                    }
                } catch(Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

            for (Experiment bestExp : experiments) {
                if(bestExp.getResult() > highest) {
                    highest = bestExp.getResult();
                    best = bestExp.getName();
                }
            }

            System.out.println("Best experiment: " + best + "." + "Result: " + highest);
            System.out.println("Total loaded: " + experiments.size());


        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}