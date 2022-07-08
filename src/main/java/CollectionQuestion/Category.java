package CollectionQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Category
{
   private List<Product> productList;

    public Category() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product)
    {
        productList.add(product);
    }

    public long getItemLessThan1000(String category)
    {
        return productList.stream().filter(p -> p.getCategory().equals(category)
                && p.getPrice()<1000).count();
    }

    public long getItemGreaterThan10000(String category)
    {
        return productList.stream().filter(p -> p.getCategory().equals(category)
        && p.getPrice()>10000).count();
    }

    public int getPrice(String category)
    {
        return productList.stream().filter(p->p.getCategory().equals(category))
                .mapToInt(Product::getPrice).sum();
    }

    public long noOfItemsCategory(String category)
    {
        return productList.stream().filter(p->p.getCategory().equals(category))
                .count();
    }

    public List<Product> getProductBasedOnTag(String tag)
    {
        return  productList.stream()
                .filter(p->p.getTags().stream().anyMatch(t->t.equals(tag))).
                collect(Collectors.toList());
    }
}
