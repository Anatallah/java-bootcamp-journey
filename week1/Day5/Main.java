package Day5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Experiment> experiments = new ArrayList<>();

        // Experiment[] experimentsArray = new Experiment[3];
        // Experiment exp1 = new Experiment("Protein Function", "2026-04-15", 22.2);
        // Experiment exp2 = new Experiment("Enzyme Activity Test", "2026-07-25", 89.56);
        // Experiment exp3 = new Experiment();
        // Experiment exp4 = new Experiment("Test Product", "2026-11-30", -10.2);

        experiments.add(new Experiment("Protein Function", "2026-04-15", 22.2));
        experiments.add(new Experiment("Enzyme Activity Test", "2026-07-25", 89.56));
        experiments.add(new Experiment());
        experiments.add(new Experiment("Test Product", "2026-11-30", -10.2));

        int successCount = 0;
        double highest = 0.0;
        for(Experiment exp : experiments) {
            exp.printInfo();

            if(exp.isSuccessful()) {
                successCount++;
            }
            
            if (exp.getResult() != -1 && exp.getResult() > highest) {
                highest = exp.getResult();
            }

            /* if(exp.getResult() != -1) {
                int i = 0;
                if(experiments.get(i + 1).getResult() > experiments.get(i).getResult()) {
                    highest = experiments.get(i + 1).getResult();
                    i++;
                }
            } */
        }

    System.out.println("You have " + successCount + " successful experiments");
    System.out.println("Your best experiment has a result of " + highest);
    }
}