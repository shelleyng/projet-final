import java.util.Scanner;

/**
 * @author : shelley
 * @Description : Classe pour déclarer les méthodes dans le productmanager
 * @created : 2024-05-09, Thursday
 **/
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String rep = "yes";
        productmanager.loadProductsFromTextFile("products.txt");
        while (rep.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter product id");
            int productId = sc.nextInt();
            System.out.println("Enter product name");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Enter category");
            String category = sc.nextLine();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            productmanager.addproduct(productId, productName, category, price);
            sc.nextLine();
            System.out.println("Do you want to add another product? (YES/NO)");
            rep = sc.nextLine();
        }
        productmanager.saveProductsToTextFile("products.txt");

        System.out.println("Display all products");
        productmanager.displayAllProducts();
        System.out.println("Display the products between prices 5.99 and 15.99");
        pricerange.rangePrice(5.99, 15.99);
    }
}
