public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double indexBmi = service.calculate(101, 1.98);
        System.out.println("Индекс массы тела = " + indexBmi + " кг/м²");
    }
}
