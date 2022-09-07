public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 54.1;
        double height = 1.62;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);

    }
}