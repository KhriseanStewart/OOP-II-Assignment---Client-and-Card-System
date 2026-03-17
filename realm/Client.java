package realm;

public class Client {

    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    public Client() {
        this.idNumber = 0;
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.card = null;
    }

    public Client(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.card = null;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void display() {
        System.out.println("--- Client ---");
        System.out.println("ID Number: " + idNumber);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        if (card != null) {
            System.out.println("--- Card ---");
            card.display();
        }
    }
}
