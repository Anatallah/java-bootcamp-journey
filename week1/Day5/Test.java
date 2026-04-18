public class Test{
    public static void main(String[] args) {
        Experiment[] experimentsArray = new Experiment[3];
        Experiment exp1 = new Experiment("Protein Function", "2026-04-15", 22.2);
        Experiment exp2 = new Experiment("Enzyme Activity Test", "2026-07-25", 89.56);
        Experiment exp3 = new Experiment();
        Experiment exp4 = new Experiment("Test Product", "2026-11-30", -10.2);
        
        experimentsArray[0] = exp1;
        experimentsArray[1] = exp2;
        experimentsArray[2] = exp3;
        
        for(int i = 0; i < experimentsArray.length; i++) {
            experimentsArray[i].printInfo();
        }
    }
}