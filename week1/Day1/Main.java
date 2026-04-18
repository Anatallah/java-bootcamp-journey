package Day1;

public class Main {
    public static void main (String[] args) {
        String name = "Antoine";
        int age = 21;

        printBasicInfo(name, age);
        printFutureAges(age);
        printCareerMessage(age);
        printYears();
    }

    public static void printBasicInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void printFutureAges(int age) {
        final int FIVE_YEARS = 5;
        final int TEN_YEARS = 10;

        System.out.println("Age in five years: " + (age + FIVE_YEARS));
        System.out.println("Age in ten years: " + (age + TEN_YEARS));
        System.out.println();
    }

    public static void printCareerMessage(int age) {
        if(age < 25) {
            System.out.println("You're still early in your career");
        } else {
            System.out.println("You're gaining experience");
        }
        System.out.println();
    }

    public static void printYears() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Year " + i);
        }
    }
}