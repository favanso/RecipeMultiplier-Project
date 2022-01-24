package Proj4;

public class Ingredients {

    private String name;
    private double quantity;
    private String measure;

    public Ingredients(String name, double quantity, String measure) {
        this.name = name;
        this.quantity = quantity;
        this.measure = measure;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + measure + " " + name;
    }

}
