public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.show_identity("Kucing", "coklat", 4);
        cat.show_identity("Kucing", "coklat putih", 4);
        dog.show_identity("Doggy", "hitam", 4);
        dog.show_identity("Doggy", "coklat biru", 4);
    }




}