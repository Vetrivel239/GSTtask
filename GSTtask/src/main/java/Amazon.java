import java.util.List;

public class Amazon {
    String productname;
    String brand;
    int year;
    double price;
    double gstcharge;
    boolean isGSTapplicable;
    private static int gstpercentage = 18;

    Amazon(String productname, String brand, int year, double price) {
        this.productname = productname;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public Amazon(String productname, String brand, int year, long price) {
    }
    public String getProductname() {
        return productname;
    }

    public String getBrand(){
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public  double getGstcharge() {
        return (price * gstpercentage) / 100;
    }

    public Boolean isGSTapplicable() {
        if (price > 2000) {
            gstcharge = getGstcharge();
            return true;
        } else {
            gstcharge = 0;
            return false;
        }
    }
    public double getTotalPrice() {

        return price + gstcharge;
    }

}