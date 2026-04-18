package Practice;

import java.util.ArrayList;

public class LoopPractice {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};
        int sum = 0;
        int largest = 0;
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if(numbers[i] > largest) {
                largest = numbers[i];
            }

            if(numbers[i] % 2 == 0) {
                count++;
            }
        }

        for(int i = numbers.length - 1; i >=0; i--) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println("The sum of all numbers in the array is " + sum);
        System.out.println("The largest number in the array is " + largest);
        System.out.println("There are " + count + " even numbers in the array");

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(10);
        nums.add(15);
        nums.add(21);
        nums.add(15);
        int listSum = 0;
        double average = 0;
        int duplicate = 0;
        for(Integer number : nums) {
            listSum += number;
            average = (double) (listSum / nums.size());
        }

        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) < 5) {
                nums.remove(i);
                // i--;
                System.out.println(nums);
            }

            for(int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i).equals(nums.get(j))) {
                    duplicate = nums.get(i);
                    System.out.println("Duplicate: Number " + duplicate);
                }
            }
        }
        System.out.println("The sum of all numbers in the list is " + listSum);
        System.out.println("The average of the numbers in the list is " + average);

        System.out.println();

        ArrayList<String> experimentNames = new ArrayList<>();
        experimentNames.add("Enzymatic Activity Test");
        experimentNames.add("Protein Analysis");
        experimentNames.add("Test Subject 1");
        int testCount = 0;
        for(int i = 0; i < experimentNames.size(); i++) {
            if(experimentNames.get(i).toLowerCase().contains("test")) {
                testCount++;
            }
        }
        System.out.println(testCount + " entires contain 'Test'");

        System.out.println();

        int[] randoms = {1, 2, 2, 3, 1, 1, 4};
        for (int i = 0; i < randoms.length; i++) {

            int countFreq = 1;
            boolean alreadyCounted = false;
            // Check if we've already counted this number before
            for (int k = 0; k < i; k++) {
                if (randoms[i] == randoms[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            // Count occurrences
            for (int j = i + 1; j < randoms.length; j++) {
                if (randoms[i] == randoms[j]) {
                    countFreq++;
                }
            }
            System.out.println(randoms[i] + " appears " + countFreq + " times");
        }
        /* int frequency = 0;
        for(int i = 0; i < randoms.length; i++) {
            for(int j = i + 1; j < randoms.length; j++) {
                if(randoms[i] == randoms[j]){
                    frequency++;
                    System.out.println(randoms[i] + " appears " + frequency + " times");
                }
            }
        } */
        
    }
}