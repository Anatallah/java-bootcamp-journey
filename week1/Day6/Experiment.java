package Day6;

public class Experiment {

    private static final double INVALID_RESULT = -1.0;
    
    private String name;
    private String date;
    private double result;
    private boolean isValid;

    public Experiment() {
        this.name = "Unknown";
        this.date = "N/A";
        this.setResult(0.0);
    }

    public Experiment(String name, String date, double result) {
        this.name = name;
        this.date = date;
        this.setResult(result);
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public double getResult() {
        return this.result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public void setResult(double result) {
        if(result < 0.0) {
            this.result = INVALID_RESULT;
            this.isValid = false;
        } else {
            this.result = result;
            this.isValid = true;
        }
    }

    public boolean isSuccessful() {
        return this.result > 50.0;
    }

    public void printInfo() {
        if(!isValid) {
            System.out.println("Invalid result");
        }
        System.out.println("Experiment: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Result: " + getResult());
        if(isSuccessful()) {
            System.out.println("Status: Successful Experiment");
        } else {
            System.out.println("Status: Failed Experiment");
        }
        System.out.println();
    }
}