import java.io.*;
import java.util.ArrayList;

/**
 * @author : shelley
 * @Description : Class pour mettre tous les méthodes
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
             writer.println(p.getProductId() + " " + p.getProductName() + " " + p.getCategory() + " " + p.getPrice());
         }
     } catch (IOException e)
     {
         e.printStackTrace();
     }
 }
 public static void loadProductsFromTextFile(String fileName)
 {
     try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
     {
         String line;
         while ((line = reader.readLine())!= null)
         {
             String[] parts = line.split(" ");
             int productId = Integer.parseInt(parts[0]);
             String productName = parts[1];
             String category = parts[2];
             double price = Double.parseDouble(parts[3]);
             addproduct(productId, productName, category, price);
         }
     }
     catch (IOException e)
     {
         e.printStackTrace();
     }
 }
 public static void searchProuctsbycategory(String category)
 {
     for (product p : products)
     {
         if (p.getCategory().equals(category))
         {
             System.out.println(p.getProductId() + " " + p.getProductName() + " " + p.getCategory() + " " + p.getPrice());
         }
     }
 }
 public static void displayAllProducts()
 {
     for (product p : products)
     {
         System.out.println(p.getProductId() + " " + p.getProductName() + " " + p.getCategory() + " " + p.getPrice());
     }
 }

}
