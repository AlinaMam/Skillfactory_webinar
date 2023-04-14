public class Main {
    public static void main(String[] args) {
        // Указываем свойства нашего объекта
        Car mazda = new Car();
        float mazdaSpeed = mazda.countSpeed(5);
//        mazda.brand = "Mazda";
//        mazda.horsePower = 190;
//        mazda.isAwd = false;
        mazda.start();
        Car lada = new Car("Lada", 123, false, 20);
        lada.start();
        System.out.println(lada.acceleration);
        System.out.println(mazdaSpeed);
        System.out.println(lada.countSpeed(5));
    }
}