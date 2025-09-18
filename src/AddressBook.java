public class AddressBook {
    int x;
    public AddressBook(){
        x = 1;
    }

    public static void main(String[] args){
        BuddyInfo obj = new BuddyInfo("Tom", "Sun St.", 1031213);
        AddressBook book = new AddressBook();
        System.out.println("Address Book changed");

    }
}
