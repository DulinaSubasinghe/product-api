package uk.ac.wetminster.tutorial01;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {}

    public PhysicalProduct(Long physicalProductId, String name, double price, 
                            double weightKg, String dimensions){
        super(physicalProductId, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }
}
