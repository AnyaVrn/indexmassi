public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        int high = 2;
        int index = service.calculate(weight,high);
        System.out.println(index);

    }
}