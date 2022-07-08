package CollectionQuestion;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class InventoryMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create CollectionQuestion.Inventory");
        Inventory inventory = new Inventory();
        Category category = new Category();

        while(true)
        {
            Product product = Product.createProduct();
            inventory.addCategory(product.getCategory());
            category.addProduct(product);

            System.out.println("Do you want to enter more products (Y/N)");
            String val = sc.nextLine();

            if(val.equals("N"))
                break;
        }

        Set<String> categorySet = inventory.getCategorySet();

        List<Product> productList = category.getProductList();

        System.out.println("\n 1. CollectionQuestion.Product having Price 0 : ");

        productList.stream().filter(p -> p.getPrice() == 0).
                forEach(p -> System.out.println(p.toString()));

        System.out.println("\n 2. Top level view in each CollectionQuestion.Category : ");

        categorySet.stream().forEach(c -> System.out.println("CollectionQuestion.Category : " + c +
                "\nProducts having price less than 1000   : " + category.getItemLessThan1000(c) +
                "\nProducts having price greater than 10000   : " + category.getItemGreaterThan10000(c) +
                "\nTotal price of this CollectionQuestion.Category   : " +category.getPrice(c) +
                "\nTotal Numbers of items in this CollectionQuestion.Category   :" + category.noOfItemsCategory(c)));

        System.out.println("\n 3. On the basis of tag : ");

        while (true)
        {
            System.out.println("Enter tag on the basis of which you want result ");
            String tag = sc.nextLine();

            category.getProductBasedOnTag(tag).stream().forEach(p -> System.out.println(p.toString()));

            System.out.println("Do you want to search more (Y/N)");
            String val = sc.nextLine();

            if(val.equals("N"))
                break;
        }

        System.out.println( "\n  Program Ends !!!!!");
    }
}
