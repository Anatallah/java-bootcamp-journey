public class Main {
    public static void main(String[] args) {
        Experiment exp1 = new Experiment("Protein Function", "2026-04-15", 22.2);
        Experiment exp2 = new Experiment("Enzyme Activity Test", "2026-07-25", 89.56);
        Experiment exp3 = new Experiment();

        exp1.printInfo();
        exp2.printInfo();
        exp3.printInfo();
    }
}