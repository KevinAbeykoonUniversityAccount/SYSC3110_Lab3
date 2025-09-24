public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Joe";
        this.address = "12 Moon St.";
        this.phoneNumber = 438830939;
    }

    public static void main(String[] args) {
        BuddyInfo obj = new BuddyInfo("Tom", "Sun St.", 1031213);
        System.out.println("Hello " + obj.getName()+"!");
    }
}
