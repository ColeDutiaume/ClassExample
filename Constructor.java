package example;

public class Constructor {
	//instance variables
	String breedName;
	String dogName;
	int age;
	
	//constructor
	public Constructor(String breed, String name, int age) {
		this.breedName = breed;
		this.dogName = name;
		this.age = age;
	}
	
	//outputs greeting if input value matches a specific value. returns generic greeting if no match.
	void greeting() {
		if(breedName.equals("Golden Retriever") || breedName.equals("Chocolate Lab") || breedName.equals("Dalmation") || breedName.equals("Pug") 
				|| breedName.equals("Weiner Dog") || breedName.equals("Boarder Collie") || breedName.equals("Mutt") || breedName.equals("Mix")) {
			System.out.println("I have a " + breedName);
		}
		else {
			System.out.println("Oh, I haven't heard of that breed!");
		}
	}
	
	//simple output
	void SpeciesType() {
		System.out.println(this.dogName + " is a lovely name!");
	}
	
	void Power() {
		switch (age) {
			case 1,2,3,4:
				System.out.println("A young puppy is hard to handle");
				for(int i = 0; i<2; i++) {
					System.out.println("Aren't they though");
				}
				break;
			case 5,6,7:
				System.out.println("A young happy dog is a lot of fun");
				for(int i = 0; i<3; i++) {
					System.out.println("That they are");
				}
				break;
			case 8,9,10,11:
				System.out.println("Getting up in their years, but plently of energy left");
				for(int i = 0; i<4; i++) {
					System.out.println("Plenty indeed");
				}
				break;
			case 12,13,14,15:
				System.out.println("A senior dog is a peaceful dog");
				for(int i = 0; i<5; i++) {
					System.out.println("very peaceful");
				}
				break;
			default:
				System.out.println("We didn't expect that age!");
				break;
			}
	}

}
