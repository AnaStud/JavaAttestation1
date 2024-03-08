import java.util.*;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> phoneList = new ArrayList<>();
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        List<Map.Entry<String, ArrayList<Integer>>> list = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(list, Comparator.comparingInt((Map.Entry<String, ArrayList<Integer>> entry) -> entry.getValue().size()).reversed());
        LinkedHashMap<String, ArrayList<Integer>> sortedPhoneBook = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : list) {
            sortedPhoneBook.put(entry.getKey(), entry.getValue());
        }
        return sortedPhoneBook;
    }
}