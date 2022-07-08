package CollectionQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product
{
    private String productName;

    private int price;

    private int count;

    private String category;

    private List<String>  tags;

    public Product(String productName, int price, int count, String category, List<String> tags) {
        this.productName = productName;
        this.price = price;
        this.count = count;
        this.category = category;
        this.tags = tags;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CollectionQuestion.Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", category='" + category + '\'' +
                ", tags=" + tags +
                '}';
    }

    public static Product createProduct()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CollectionQuestion.Product CollectionQuestion.Category");
        String category = sc.nextLine();
        System.out.println("Enter CollectionQuestion.Product Name");
        String productName = sc.nextLine();
        System.out.println("Enter product Price");
        int price = sc.nextInt();
        System.out.println("Enter Products tag(You can enter multiple tag)");
        sc.nextLine();
        List<String> tagList = new ArrayList<>();
        while (true)
        {
            String tag = sc.nextLine();
            tagList.add(tag);
            System.out.println("Do you want to enter more tags (Y/N)");
            String val = sc.nextLine();

            if(val.equals("N"))
                break;
        }
        System.out.println("Enter quantity of CollectionQuestion.Product");
        int quantity = sc.nextInt();

        Product product = new Product(productName, price, quantity, category, tagList);

        return  product;
    }
}
