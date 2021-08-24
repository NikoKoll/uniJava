import java.util.ArrayList;

public class ZooMain {

	public static void main(String[] args) {
		Human onePerson = new Human("Dimitris", 19, 'M', "Papadopoulos", "Greek", "Androutsou");
		Mammal secondPerson = new Human("sokratis", 19, 'M', "papadopoulos", "grekk", "androutsou");
		Mammal myDog = new Dog("Azpr", 2, 'M', "Tsopanoskilo");
		Mammal myCat = new Cat("Mew", 2, 'M', "Pokemon");

		ArrayList<Mammal> list = new ArrayList<Mammal>();
		list.add(onePerson);
		list.add(myDog);
		list.add(myCat);


/*		for(int i = 0; i < list.size(); i ++){
			// human
			if(list.get(i) instanceof Human){
				System.out.println(((Human) list.get(i)).getSurname());
			}
		}
*/
		System.out.println(onePerson.toString());
		System.out.println(myDog.toString());
		System.out.println(myCat.toString());
		System.out.println(secondPerson.toString());

	
		
	}

}
