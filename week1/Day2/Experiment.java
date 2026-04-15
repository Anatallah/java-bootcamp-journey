public class Experiment {
    String name;
    String date;
    double result;

    public void printInfo() {
        System.out.println("Experiment: " + name);
        System.out.println("Date: " + date);
        System.out.println("Result: " + result);
        System.out.println();
    }
}