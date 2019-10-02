public class BikeTest {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Scott", "Scala 30", "MTB", 26, 2500.50, 9.6, "czerwony", false);
        Bike bike2 = new Bike("Kross", "Level 9", "Turystyczny", 28, 1900.5, 14.6, "biały", true);

        bike1.showBikeDetails();
        bike2.showBikeDetails();
    }
}
