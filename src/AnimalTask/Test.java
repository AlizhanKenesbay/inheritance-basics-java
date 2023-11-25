package AnimalTask;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Bird(), new Cat()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
