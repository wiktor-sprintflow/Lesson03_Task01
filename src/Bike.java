public class Bike {
    String producer;
    String model;
    String type;
    double wheelSize;
    double price;
    double weight;
    String color;
    boolean isNew;

    void showBikeDetails() {
        System.out.println("Rower " + this.producer + " " + this.model + " typ " + this.type + " ma koła o rozmiarze " +
                this.wheelSize + " cali, kosztuje " + this.price + " PLN, waży " + this.weight + "kg, ma kolor " +
                this.color + " i jest nowy (" + this.isNew + ").");
    }
}
