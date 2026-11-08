package uk.ac.wetminster.tutorial01;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct() {}

    public DigitalProduct(Long digitalProductId, String name, double price, 
                           String downloadUrl, double fileSizeMB) {
        super(digitalProductId, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
        this.discountedPrice = price;
    }

    public String getDownloadUrl() { return downloadUrl; }
    public double getFileSizeMB() { return fileSizeMB; }

    @Override
    public String getSummary() {
        return "Digital: " + getName() + " | Download: " + downloadUrl;
    }

    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() { return discountedPrice; }
}
