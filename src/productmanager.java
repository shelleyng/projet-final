import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author : shelley
 * @Description :
 * @created : 2024-05-09, Thursday
 **/
public class productmanager
{
    public static ArrayList<product> products = new ArrayList<product>();

public static void addproduct (int productId, String productName, String category, double price)
{
    product product = new product(productId, productName, category, price);
    products.add(product);
}
 public static void removeproduct (int productId)
 {
     for (int i = 0; i < products.size(); i++)
     {
         if (products.get(i).getProductId() == productId)
         {
             products.remove(i);
         }
     }
 }
 public static void saveProductsToTextFile(String fileName)
 {
     try (PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
     {
         for (product p : products)
         {
             writer.println()
         }
     }
 }
}
