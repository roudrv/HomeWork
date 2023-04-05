package task1;

public class Product {
    private String nameProduct;
    private int count;
    private float price;

    public Product(String nameProduct, int count, float price) {
        this.nameProduct = nameProduct;
        this.count = count;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }
}
