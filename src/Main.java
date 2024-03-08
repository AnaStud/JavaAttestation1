//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Ivanov", 111111);
        myPhoneBook.add("Petrov", 222222);
        myPhoneBook.add("Sidorov", 333333);
        myPhoneBook.add("Petrov", 444444);
        myPhoneBook.add("Ivanov", 555555);
        myPhoneBook.add("Sidorov", 666666);
        myPhoneBook.add("Ivanov", 777777);
        myPhoneBook.add("Sidorov", 888888);
        myPhoneBook.add("Sidorov", 999999);

        System.out.println(PhoneBook.getPhoneBook());
    }
}