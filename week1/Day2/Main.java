package Day2;

public class Main {
    public static void main(String[] args) {
        Experiment exp1 = new Experiment();
        exp1.name = "Protein Analysis";
        exp1.date = "2026-04-14";
        exp1.result = 42.5;

        Experiment exp2 = new Experiment();
        exp2.name = "DNA Sequencing";
        exp2.date = "2026-04-15";
        exp2.result = 88.2;

        Experiment exp3 = new Experiment();
        exp3.name = "Enzymatic Inhibitor Testing";
        exp3.date = "2026-04-16";
        exp3.result = 12.5;

        exp1.printInfo();
        exp2.printInfo();
        exp3.printInfo();
    }
}
