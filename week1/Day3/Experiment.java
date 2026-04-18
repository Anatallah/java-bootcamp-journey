package Day3;

public class Experiment{
    String name;
    String date;
    double result;

    public Experiment() {
        this.name = "unknown";
        this.date = "N/A";
        this.result = 0.0;
    }

    public Experiment(String name, String date, double result) {
        this.name = name;
        this.date = date;
        this.result = result;
    }

    public boolean isSuccessful() {
        if(this.result > 50) {
            return true;
        } else {
            return false;
        }
        // Can write it like this:
        // return this.result > 50;
    }

    public void printInfo() {
        System.out.println("Experiment: " + name);
        System.out.println("Date: " + date);
        System.out.println("Result: " + result);
        if(isSuccessful()) {
            System.out.println("Status: Successful");
        } else {
            System.out.println("Status: Failed");
        }
        System.out.println();
    }
}