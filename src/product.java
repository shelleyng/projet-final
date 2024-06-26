/**
 * @author : shelley
 * @Description : Class qui permet pour déclarer le modèle des produits
 * @created : 2024-05-09, Thursday
 **/
public class product
{
    int productId;
    String productName;
    String category;
    double price;

    public product(int productId, String productName, String category, double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public int getProductId() {return productId;}

    public void setProductId(int productId) {this.productId = productId;}

    public String getProductName() {return productName;}

    public void setProductName(String productName) {this.productName = productName;}

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category = category;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}
}