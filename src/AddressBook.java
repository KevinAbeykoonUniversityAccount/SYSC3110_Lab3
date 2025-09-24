import java.util.*;
public class AddressBook {
    private Set<BuddyInfo> buddyInfo;
    public AddressBook(){
        buddyInfo = new HashSet<>();
    }

    public void add(BuddyInfo buddy){
        buddyInfo.add(buddy);
    }

    public void remove(BuddyInfo buddy){
        buddyInfo.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo obj = new BuddyInfo("Tom", "Sun St.", 1031213);
        AddressBook book = new AddressBook();
        book.add(obj);
        book.remove(obj);
        System.out.println("Hello, change ");

    }
}
