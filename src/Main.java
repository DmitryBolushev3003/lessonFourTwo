// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService Bmi = new BmiService();
        double resultBmi = Bmi.calculate(98,1.87);
        int intBmi = (int) resultBmi;
        System.out.println("Ваш bmi составляет - " + intBmi );
    }
}