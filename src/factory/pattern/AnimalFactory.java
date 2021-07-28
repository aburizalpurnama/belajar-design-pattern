package factory.pattern;

public class AnimalFactory {

    public static Animal createAnimal (String type){
        if (type == "tiger"){
            return new BigCat();
        } else if (type == "cat"){
            return new Cat();
        } else {
            return new Snake();
        }
    }

}
