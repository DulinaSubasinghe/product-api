package uk.ac.wetminster.tutorial01;

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {}

    public PhysicalProduct(Long physicalProductId, String name, double price, 
                            double weightKg, String dimensions){
        super(physicalProductId, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }

    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }

    @Override
    public String getSummary() {
        return "Physical: " + getName() + " | Weight: " + weightKg;
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        double discount = getPrice() * capped;
        this.discountedPrice = getPrice() - discount;
    }

    @Override
    public double getDiscountedPrice() { return discountedPrice; }
}
