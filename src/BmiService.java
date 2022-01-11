public class BmiService {
    public double calculate (int weight, double height) {
        double indexBmi = weight / (height*height); // ИМТ = вес/рост в квадрате
        return indexBmi;
    }
}
