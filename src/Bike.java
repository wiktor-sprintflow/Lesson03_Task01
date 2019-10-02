public class Bike {
    String producer;
    String model;
    String type;
    double wheelSize;
    double price;
    double weight;
    String color;
    boolean isNew;

    public Bike(String producer, String model, String type, double wheelSize, double price, double weight, String color, boolean isNew) {
        this.producer = producer;
        this.model = model;
        this.type = type;
        this.wheelSize = wheelSize;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.isNew = isNew;
    }

    void showBikeDetails() {
        System.out.println("Rower " + this.producer + " " + this.model + " typ " + this.type + " ma koła o rozmiarze " +
                this.wheelSize + " cali, kosztuje " + this.price + " PLN, waży " + this.weight + "kg, ma kolor " +
                this.color + " i jest nowy (" + this.isNew + ").");
    }
}
