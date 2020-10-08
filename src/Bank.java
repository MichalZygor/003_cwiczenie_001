import java.security.spec.RSAOtherPrimeInfo;

public class Bank {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount();
//        account1.firtName = "Jan";
//        account1.lastName = "Kowal";
//        account1.pesel = "12312312398";
//        account1.balance = 10_000;

        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowal";
        person.pesel = "12121212345";

        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}
