package Day6;

import java.util.ArrayList;

public class Main {

    private static final double INVALID_RESULT = -1.0;

    public static void main(String[] args) {
        ArrayList<Experiment> experiments = new ArrayList<>();

        experiments.add(new Experiment("Protein Function", "2026-04-15", 52.2));
        experiments.add(new Experiment("Enzyme Activity Test", "2026-07-25", 89.56));
        experiments.add(new Experiment());
        experiments.add(new Experiment("Test Product", "2026-11-30", -10.2));
        experiments.add(new Experiment("Point Mutation Test", "2026-08-08", -22.1));

        System.out.println("Current experiments: " + experiments.size());
        System.out.println();

        for(int i = 0; i < experiments.size(); i++) {
            Experiment exp = experiments.get(i);
            if(exp.getResult() == INVALID_RESULT) {
                experiments.remove(i);
                i--;
            }
        }
        System.out.println("Remaining experiments: " + experiments.size());
        System.out.println();

        boolean found = false;
        for(Experiment exp : experiments) {
            if(exp.getName().equalsIgnoreCase("test product")) {
                System.out.println("Found experiment: " + exp.getName());
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Experiment not found");
        }
        System.out.println();

        double bestResult = Double.MIN_VALUE; // use that instead of 0.0
        String bestName = "";
        for(Experiment exp : experiments) {
            if(exp.getResult() > bestResult) {
                bestResult = exp.getResult();
                bestName = exp.getName();
            }
        }
        System.out.println("Best experiment: " + bestName + " with result " + bestResult);
        System.out.println();

        for(Experiment exp : experiments) {
            if(exp.isSuccessful()) {
                System.out.println("First successful experiment: " + exp.getName());
                break;
            }
        }
        System.out.println();
    }
}
