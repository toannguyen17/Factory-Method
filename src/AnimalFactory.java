public class AnimalFactory {
	public Animal getAnimal(String type){
		switch (type){
			case "canine":
				return new Dog();
			default:
				return new Cat();
		}
	}
}
