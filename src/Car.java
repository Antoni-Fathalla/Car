public class Car {
    private int id; // Id är read only (privat)
    private String brand;
    private double speed;
    private int millage;
    private String owner;
    private int value;

    Car(int id, String brand, String owner, int value) {
        this.id = id;
        this.brand = brand;
        this.owner = owner;
        this.value = value;

        this.millage = 0;
        this.speed = 0;
    }

    void speedUp(double increase) {
        this.speed += increase;

        if (this.speed > 220) this.speed = 220;
    }

    void slowDown(double decrease) {
        this.speed -= decrease;

        if (this.speed < 0) this.speed = 0;
    }

    void stop() {
        this.speed = 0;
    }
    int getID() {
        return this.id;
    }

    String getBrand() {
        return this.brand;
    }

    double getSpeed() {
        return this.speed;
    }

    int getMillage() {
        return this.millage;
    }

    String getOwner() {
        return this.owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    int getValue() {
        return this.value;
    }
}
