package Day7;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static final double INVALID_RESULT = -1.0;

    public static void main(String[] args) {
        ArrayList<Experiment> experiments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        /* experiments.add(new Experiment("Protein Function", "2026-04-15", 52.2));
        experiments.add(new Experiment("Enzyme Activity Test", "2026-07-25", 89.56));
        experiments.add(new Experiment());
        experiments.add(new Experiment("Test Product", "2026-11-30", -10.2));
        experiments.add(new Experiment("Point Mutation Test", "2026-08-08", -22.1)); */

        boolean isactive = true;
        while(isactive) {

            System.out.println("There are " + experiments.size() + " experiments\n"
                                + "    1. View all experiments\n"
                                + "    2. Add experiment\n"
                                + "    3. Search experiment\n"
                                + "    4. Remove invalid experiments\n"
                                + "    5. Exit\n"
                                + "Please choose a number");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if((choice == 1) || (choice == 2) || (choice == 3) || (choice == 4)
                        || (choice == 5)) {
                System.out.println();

                if(choice == 1) {
                    for(Experiment exp : experiments) {
                        exp.printInfo();
                    }
                }

                if(choice == 2) {
                    System.out.println("Enter name");
                    String name = scanner.nextLine();

                    System.out.println("Enter date");
                    String date = scanner.nextLine();

                    System.out.println("Enter result");
                    double result = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Done");
                    experiments.add(new Experiment(name, date, result));
                }

                if(choice == 3) {
                    boolean found = false;
                    System.out.println("What experiment are you looking for?");
                    String search = scanner.nextLine();
                    for(Experiment exp : experiments) {
                        if(exp.getName().equalsIgnoreCase(search)) {
                            System.out.println("Found experiment: " + exp.getName());
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Experiment not found");
                    }
                }

                if(choice == 4) {
                    for(int i = 0; i < experiments.size(); i++) {
                        Experiment exp = experiments.get(i);
                        if(exp.getResult() == INVALID_RESULT) {
                        experiments.remove(i);
                        i--;
                        }
                    }
                    System.out.println("Remaining experiments: " + experiments.size());
                }

                if(choice == 5) {
                    isactive = false;
                }
            } else {
                System.out.println("Invalid option\n");
            }
        }
        scanner.close();
    }
}