package Q_04;

public class Main_Q04 {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle("Chalani", "0716756234");

        System.out.println("owner: " + myBike.getOwner().getOwnerName());
        System.out.println("Phone No: " + myBike.getOwner().getPhoneNo());
    }
}
