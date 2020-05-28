
public class FactoryDemo {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();

		Animal feline = animalFactory.getAnimal("feline");
		System.out.println("Feline sound: " + feline.makeSound());

		Animal canine = animalFactory.getAnimal("canine");
		System.out.println("Canine sound: " + canine.makeSound());

	}
}
