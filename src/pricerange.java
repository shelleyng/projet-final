import java.util.ArrayList;

/**
 * @author : shelley
 * @Description : Class pour ranger les prix de maximum à minimum
 * @created : 2024-05-09, Thursday
 **/
public class pricerange
{
    public static void rangePrice (double minPrice, double maxMark)
    {
        ArrayList<product> price = new ArrayList<product>();
        for (product p : productmanager.products)
        {
            if (p.getPrice() >= minPrice && p.getPrice() <= maxMark)
            {
                System.out.println(p.getProductId() + " " + p.getProductName() + " " + p.getCategory() + " " + p.getPrice());
            }
        }
    }
}
