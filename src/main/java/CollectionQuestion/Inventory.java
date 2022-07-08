package CollectionQuestion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Inventory
{
    private Set<String> categorySet;

    public Inventory() {
        categorySet  = new HashSet<>();
    }

    public Set<String> getCategorySet() {
        return categorySet;
    }

    public void setCategorySet(Set<String> categorySet) {
        this.categorySet = categorySet;
    }

    public void addCategory(String category)
    {
        categorySet.add(category);
    }
}
