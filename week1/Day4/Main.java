package Day4;

public class Main{
    public static void main(String[] args) {
        Experiment exp1 = new Experiment("Protein Function", "2026-04-15", 22.2);
        Experiment exp2 = new Experiment("Enzyme Activity Test", "2026-07-25", 89.56);
        Experiment exp3 = new Experiment();
        Experiment exp4 = new Experiment("Test Product", "2026-11-30", -10.2);

        exp1.printInfo();
        exp2.printInfo();
        exp3.printInfo();
        exp4.printInfo();
    }
}