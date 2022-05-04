public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80.0; // килограмм
        double height = 1.9; // метров
        double bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела " + bmi);
    }
}
