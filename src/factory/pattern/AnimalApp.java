package factory.pattern;

public class AnimalApp {
    public static void main(String[] args) {

        /**
         * TANPA FACTORY PATTERN
         *
         * jika ada salah datu class yang harus depreceted dan harus menggunakan class baru, maka seluruh
         * objek yang meninstance class tersebut harus dirubah sesuai dengan class yang baru.
         */
//        var tiger = new Tiger();
//        var cat = new Cat();
//        var snake = new Snake();

        var tiger = AnimalFactory.createAnimal("tiger");
        var cat = AnimalFactory.createAnimal("cat");
        var snake = AnimalFactory.createAnimal("snake");

        tiger.speak();
        cat.speak();
        snake.speak();
    }
}
