package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeCategory extends Category{

    private List<Category> categories = new ArrayList<>();

    public CompositeCategory(String name, List<Category> categories) {
        super(name);
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
