import java.util.ArrayList;
import java.util.List;
public class Shop {

    private List<Amazon>allProduct;

    public Shop() {
        allProduct = new ArrayList<Amazon>();
    }

    public void addProduct(Amazon Product){
        allProduct.add(Product);
    }

    public List<Amazon> getAllProduct() {
        return allProduct;
    }

    public List<Amazon> getGSTProduct() {
        List<Amazon> gstProductWithGST = new ArrayList<Amazon>();
        for (Amazon gstProduct1 : getAllProduct()) {
            if (gstProduct1.isGSTapplicable()) {
                gstProductWithGST.add(gstProduct1);
            }
        }
        return gstProductWithGST;
    }

    public double getTotalPrice(Amazon Product) {
        if (Product.isGSTapplicable()) {
            return Product.price + Product.getGstcharge();
        } else {
            return Product.price;
        }
    }
}

