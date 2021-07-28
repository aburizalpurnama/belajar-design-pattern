package factory.pattern;

public interface Animal {
    public void speak();
}

@Deprecated
class Tiger implements Animal{
    @Override
    public void speak() {
        System.out.println("Roar!");
    }
}

class BigCat implements Animal{
    @Override
    public void speak() {
        System.out.println("Roar!");
    }
}

class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Meao");
    }
}

class Snake implements Animal{
    @Override
    public void speak() {
        System.out.println("sszsssttt");
    }
}

