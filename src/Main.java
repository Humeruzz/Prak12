public class Main {

    public static void main(String[] args) {
	Person person = new Person();
	person.printPerson();
	Adress adress = new Adress();
	adress.printAdress();
	Shirt shirt = new Shirt();
	shirt.printShirt();
	Telephone telephone = new Telephone("86543453466");
	telephone.printPhone();
    }
}
