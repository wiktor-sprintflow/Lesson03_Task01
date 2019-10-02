public class BikeTest {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.producer = "Scott";
        bike1.model = "Scala 30";
        bike1.type = "MTB";
        bike1.wheelSize = 26;
        bike1.price = 2500.50;
        bike1.weight = 9.6;
        bike1.color = "czerwony";
        bike1.isNew = false;

        Bike bike2 = new Bike();
        bike2.producer = "Kross";
        bike2.model = "Level 9";
        bike2.type = "Turystyczny";
        bike2.wheelSize = 28;
        bike2.price = 1900.50;
        bike2.weight = 14.6;
        bike2.color = "biały";
        bike2.isNew = true;

        bike1.showBikeDetails();
        bike2.showBikeDetails();
    }
}
