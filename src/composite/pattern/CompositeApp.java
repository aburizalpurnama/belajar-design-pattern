package composite.pattern;

import java.util.Arrays;
import java.util.List;

public class CompositeApp {

    public static void main(String[] args) {
        createComposite();
    }

    static void createComposite(){
        List<Category> categories = Arrays.asList(
                new CompositeCategory("Handphone", Arrays.asList(
                        new CompositeCategory("Smartphone", Arrays.asList(
                                new Category("Android"),
                                new Category("IOS")
                        )),
                        new CompositeCategory("Feature phone", Arrays.asList(
                                new Category("Nokia"),
                                new Category("Motorolla")
                        ))
                )),
                new CompositeCategory("Computer", Arrays.asList(
                        new CompositeCategory("Gaming", Arrays.asList(
                                new Category("Asus ROG"),
                                new Category("Dell Allienware"),
                                new Category("MSI")
                        )),
                        new CompositeCategory("Ultrabook", Arrays.asList(
                                new Category("Dell XPS"),
                                new Category("HP sprectre"),
                                new Category("Apple Macbook")
                        ))
                )),
                new CompositeCategory("Fashion", Arrays.asList(
                        new CompositeCategory("Fahion Pria", Arrays.asList(
                                new CompositeCategory("Atasan", Arrays.asList(
                                        new Category("Kaos"),
                                        new Category("Kemeja")
                                )),
                                new CompositeCategory("Celana", Arrays.asList(
                                        new Category("Jeans"),
                                        new Category("Chinos")
                                ))
                        )),
                        new CompositeCategory("Fashion Wanita", Arrays.asList(
                                new CompositeCategory("Atasan", Arrays.asList(
                                        new Category("Kaos"),
                                        new Category("Kemeja")
                                )),
                                new CompositeCategory("Celana", Arrays.asList(
                                        new Category("Jeans"),
                                        new Category("Chinos")
                                ))
                        ))
                ))
        );

        categories.forEach(category -> {
            printCategori(category);

            if (category instanceof CompositeCategory){
                CompositeCategory compositeCategory = (CompositeCategory) category;
                compositeCategory.getCategories().forEach(category1 -> {
                    System.out.println("\t" + category1.getName());

                    if (category1 instanceof CompositeCategory){
                        CompositeCategory compositeCategory1 = (CompositeCategory) category1;
                        compositeCategory1.getCategories().forEach(category2 -> {
                            System.out.println("\t\t" + category2.getName());
                        });
                    }
                });
            }
        });
    }

    public static void printCategori(Category category){
        System.out.println(category.getName());
    }
}

