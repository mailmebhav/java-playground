package main.java;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println(address.replace(".","[.]"));
    }
}
