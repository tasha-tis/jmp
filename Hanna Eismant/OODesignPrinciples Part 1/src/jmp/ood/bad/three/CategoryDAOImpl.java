package jmp.ood.bad.three;

import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImpl implements CategoryDAO {

    static private List<Category> categories = new ArrayList<>();

    @Override
    public Category findCategoryOne() {
        for (Category category : categories) {
            if (category.getName().equals("One")) {
                return category;
            }
        }

        return null;
    }

    @Override
    public Category findCategoryTwo() {
        for (Category category : categories) {
            if (category.getName().equals("Two")) {
                return category;
            }
        }

        return null;
    }

}
