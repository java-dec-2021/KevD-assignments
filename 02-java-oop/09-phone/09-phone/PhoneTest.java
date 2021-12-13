public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s8 = new Galaxy("S8", 99, "Verizon", "Ring Ring RING!");
        IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");

        s8.displayInfo();
        System.out.println(s8.Ring());
        System.out.println(s8.unlock());

        iphoneTen.displayInfo();
        System.out.println(iphoneTen.Ring());
        System.out.println(iphoneTen.unlock());
    } 
}
